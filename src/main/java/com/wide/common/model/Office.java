package com.wide.common.model;

import java.util.List;

import com.wide.common.model.base.BaseOffice;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Office extends BaseOffice<Office> {
	public static final Office dao = new Office();

	public List<Office> getOfficeByuserID(String userid) {
		// TODO Auto-generated method stub
		List<Office> lists = find(" select t1.* from sys_office t1,sys_office_user t2 where t1.id = t2.office_id and t1.del_flag = 0 and t2.user_id = ? ", userid);
		return lists;
	}

	public List<Office> findByPid(String pid) {
		// TODO Auto-generated method stub
		List<Office> lists = find(" select t1.* from sys_office t1 where 1=1 and t1.del_flag = 0 and t1.parent_id = ? ", pid);
		return lists;
	}
	
	public List<Office> findByRoleId(String id){
		List<Office> lists = find(" select t1.* from sys_office t1,sys_role_office t2 where 1=1 and t1.del_flag = 0 and t1.id = t2.office_id and t2.role_id = ? ", id);
		return lists;
	}

	public List<Office> getOfficeAll() {
		// TODO Auto-generated method stub
		List<Office> list = find(" select t1.* from sys_office t1 where 1=1 and t1.del_flag = 0 order by t1.sort asc");
		return list;
	}
	
}
