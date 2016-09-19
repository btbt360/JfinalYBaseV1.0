package com.wide.baseproject.sys.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.jfinal.aop.Before;
import com.jfinal.aop.Clear;
import com.jfinal.aop.Enhancer;
import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.activerecord.tx.Tx;
import com.wide.baseproject.sys.service.DictService;
import com.wide.baseproject.sys.service.LogService;
import com.wide.baseproject.sys.service.OfficeService;
import com.wide.baseproject.sys.service.RoleService;
import com.wide.baseproject.sys.service.UserService;
import com.wide.common.model.Dict;
import com.wide.common.model.Office;
import com.wide.common.model.Role;
import com.wide.common.model.User;
import com.wide.common.model.query.QueryUser;
import com.wide.config.UserToken;
import com.wide.constant.EnumFuncType;
import com.wide.constant.EnumOptType;
import com.wide.util.ExportController;
import com.wide.validator.UserValidator;
import com.wide.viewmodel.DataTablesModel;
import com.wide.viewmodel.ViewUser;

public class UserController extends Controller {
	private static final UserService userService = Enhancer
			.enhance(UserService.class);
	private static final RoleService roleService = Enhancer
			.enhance(RoleService.class);
	private static final DictService dictService = Enhancer
			.enhance(DictService.class);
	private static final OfficeService officeService = Enhancer
			.enhance(OfficeService.class);
	private static final LogService logService = Enhancer
			.enhance(LogService.class);	

	
	/**
	 * 获取当前UserToken
	 * @return UserToken
	 */
	public UserToken getCurrentUserToken(){
		HttpSession session = getSession();          //获取当前用户
		UserToken ut = (UserToken) session.getAttribute("userToken");
		User user = userService.getUser(ut.getVuser().getUser());
		
		return ut;
		
	}	
    
	public void index() {
		// 分页
		setAttr("userPage", User.dao.paginate(getParaToInt(0, 1), 10));
		redirect("/user/mainindex");
	}
	/**
	 * @author cg 用户管理
	 */
	public void add() {
		List<Dict> listd = dictService.getDictByType("1003");
		setAttr("listdict", listd);
		render("userList.jsp");
	}

	/**
	 * @author cg Datetables分页显示
	 */
	public void addUserList() {
		QueryUser queryUser = new QueryUser();
		String usertype = getPara("usertype");
		queryUser.setUsertype(usertype == null || usertype.equals("") ? 0
				: Integer.parseInt(usertype));
		queryUser.setEndtime(getPara("endtime"));
		queryUser.setStarttime(getPara("starttime"));
		queryUser.setUsername(getPara("username"));
		DataTablesModel userpage = userService.getPageUser(getParaToInt("page")
				.intValue(), getParaToInt("rp").intValue(), queryUser);
		this.renderJson(userpage);
	}

	/**
	 * @author cg 保存个人信息
	 */
	@Before(UserValidator.class)
	public void save() {
		getModel(User.class).save();
		redirect("/user");
	}

	/**
	 * @author cg 编辑个人信息
	 */
	public void edit() {
		setAttr("user", User.dao.findById(getParaToInt()));
	}

	/**
	 * @author cg 更新个人信息
	 */
	@Before(UserValidator.class)
	public void update() {
		getModel(User.class).update();
		redirect("/user");
	}

	/**
	 * @author cg 我的面板
	 */

	public void addInfo() {			
		UserToken ut = getCurrentUserToken();
		ut.getVuser().setUser(userService.getUser(ut.getVuser().getUser()));
		setAttr("userToken", ut);
		String mark = getPara("message");
		setAttr("message", mark);
		render("addinfo.jsp");
	}
	/**
	 * @author ycl 默认首页
	 */

	public void mainindex() {			
		UserToken ut = getCurrentUserToken();
		ut.getVuser().setUser(userService.getUser(ut.getVuser().getUser()));
		setAttr("userToken", ut);
		String mark = getPara("message");
		
		
		setAttr("message", mark);
		render("main.jsp");
	}

	/**
	 * @author cg 更新个人信息
	 */	
	public void saveInfo() {
		getModel(User.class).update();
		redirect("/user/addInfo?message=success", true);
	}

	/**
	 * @author cg 更新密码 
	 */
	public void addpass() {		
		String mark = getPara("message");
		setAttr("message", mark);
		logService.saveLog(EnumOptType.password.getEnumKey(), EnumFuncType.user.getEnumKey(),userService.getUser(getCurrentUserToken().getVuser().getUser())); //用户密码修改日志保存
		render("myEditPass.jsp");
	}

	/**
	 * @author cg 更新密码
	 */
	public void updatepass() {	
		getModel(User.class).update();		
		logService.saveLog(EnumOptType.password.getEnumKey(), EnumFuncType.user.getEnumKey(), userService.getUser(getCurrentUserToken().getVuser().getUser())); //用户密码修改日志保存
		redirect("/user/addpass?message=success", true);
	}

	/**
	 * @author cg 验证密码
	 */
	public void checkpass() {
		String pass = getPara("oldpassword");
		HttpSession session = getSession();
		UserToken ut = (UserToken) session.getAttribute("userToken");
		User user = userService.getUser(ut.getVuser().getUser());
		renderJson(pass.equals(user.getPassword()) ? 1 : 2);// 1输入正确、2输入错误
	}

	/**
	 * @author cg 增加用户
	 */
	public void adduserinfo() {
		String id = getPara("id");
		User user = userService.getUserById(id);
		List<Dict> listd = dictService.getDictByType("1003");
		List<Role> rolelist = roleService.getRoleAll();
		List<Role> rulist = Role.dao.getRoleByuserID(id);
		List<Office> officelist = officeService.getOfficeListByuserID(id);
		String officenames = "";
		String officeids = "";
		String roleids = "";
		if (officelist.size() > 0) {
			for (Office o : officelist) {
				officenames = officenames + "|" + o.getName();
				officeids = officeids + o.getId() + "|";
			}
		}
		if (rulist.size() > 0) {
			for (Role r : rulist) {
				roleids = roleids + "|" + r.getId();
			}
		}
		String mark = getPara("message");
		setAttr("listdict", listd);
		setAttr("message", mark);
		setAttr("user", user);
		if(user!=null){
			setAttr("utype", user.getUserType());
		}else{
			setAttr("utype", "0");
		}
		
		setAttr("rolelist", rolelist);
		setAttr("offids", officeids);
		setAttr("roleids", roleids);
		setAttr("officenames", officenames);
		render("userInfo.jsp");
	}

	/**
	 * @author cg 保存用户
	 */
	//@Before(UserValidator.class)
	public void saveuserinfo() {		
		ViewUser vu = new ViewUser();	
		String roleids = getPara("roleids");
		String offids = getPara("offids");
		String userType = getPara("usertype");
		User user = getModel(User.class);
		user.setUserType(userType);
		user.setUpdateBy(userService.getUser(getCurrentUserToken().getVuser().getUser()).getId());
		user.setUpdateDate(new Date());
		vu.setOfficeids(offids);
		vu.setRoleids(roleids);
		vu.setUser(user);
		if(vu.getUser().getId() != null && !vu.getUser().getId().equals("")){
			logService.saveLog(EnumOptType.edit.getEnumKey(), EnumFuncType.user.getEnumKey(), userService.getUser(getCurrentUserToken().getVuser().getUser())); //用户修改日志保存
		}else {
			logService.saveLog(EnumOptType.add.getEnumKey(), EnumFuncType.user.getEnumKey(), userService.getUser(getCurrentUserToken().getVuser().getUser())); //用户添加日志保存
		}
		userService.saveuserinfo(vu, userService.getUser(getCurrentUserToken().getVuser().getUser()));
		
		
		redirect("/user/adduserinfo?message=success", true);
	}

	/**
	 * @author cg 删除用户
	 * */
	@Before(Tx.class)
	public boolean deluserinfo() {	
		String id = getPara("id");
		id = id == null ? "" : id;
		try {
			userService.deluserinfo(id);
			logService.saveLog(EnumOptType.del.getEnumKey(), EnumFuncType.user.getEnumKey(), userService.getUser(getCurrentUserToken().getVuser().getUser())); //用户删除日志保存
			renderJson("2");
		} catch (Exception e) {
			renderJson("1");
			e.printStackTrace();
		}

		return true;
	}

	/**
	 * @author cg 导出用户
	 * */
	public void exportUser() {		
		QueryUser queryUser = new QueryUser();
		String usertype = getPara("usertype");
		queryUser.setUsertype(usertype == null || usertype.equals("") ? 0
				: Integer.parseInt(usertype));
		queryUser.setEndtime(getPara("endtime"));
		queryUser.setStarttime(getPara("starttime"));
		queryUser.setUsername(getPara("username"));
		DataTablesModel userpage = userService.getPageUser(
				getParaToInt("userpages").intValue(), getParaToInt("userrp")
						.intValue(), queryUser);
		String[] heades = { "用户姓名", "用户登录名称", "用户邮箱", "用户电话", "用户类型", "是否启用" };
		ExportController.exportXLSRecord(userpage.getRows(), "用户管理", heades,
				"1", this.getResponse());
		logService.saveLog(EnumOptType.export.getEnumKey(), EnumFuncType.user.getEnumKey(), userService.getUser(getCurrentUserToken().getVuser().getUser())); //用户导出日志保存
		renderJson("导出成功");
	}
	 /**
	  * @author phm 重置密码
	  */
	 public void resetpassword(){
		 String id = getPara("id");
		 id = id==null?"":id;
		 try {
			 String sql = "update sys_user set password='111111' where id='"+id+"'" ;
			 Db.update(sql);
			 String mark = getPara("message");
			 setAttr("message", mark);		
			 logService.saveLog(EnumOptType.reset.getEnumKey(), EnumFuncType.user.getEnumKey(), userService.getUser(getCurrentUserToken().getVuser().getUser())); //用户密码重置日志保存
			 renderJson("0");
		} catch (Exception e) {
			renderJson("1");
			e.printStackTrace();
		}
	 }
	 /**
	  * @author phm 验证用户名是否重复
	  */
	 @Clear
	 public void checkloginname(){
		 String loginName = getPara("loginName");
		 try {
			if(loginName!=null&&loginName.equals("")!=true){
				 String sql = "select * from sys_user where login_name = '"+loginName+"' and del_flag ='0' " ;
				 List<Record> userlist = new ArrayList<Record>();
				 userlist =  Db.find(sql);
				 if(userlist.size()>0){
					 renderJson("1");
				 }else {
					 renderJson("0");
				}
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }
}
