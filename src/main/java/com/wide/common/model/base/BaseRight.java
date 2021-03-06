package com.wide.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseRight<M extends BaseRight<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}

	public java.lang.String getId() {
		return get("id");
	}

	public void setResourcesid(java.lang.String resourcesid) {
		set("resourcesid", resourcesid);
	}

	public java.lang.String getResourcesid() {
		return get("resourcesid");
	}

	public void setResourcestype(java.lang.Integer resourcestype) {
		set("resourcestype", resourcestype);
	}

	public java.lang.Integer getResourcestype() {
		return get("resourcestype");
	}

	public void setCreateBy(java.lang.String createBy) {
		set("create_by", createBy);
	}

	public java.lang.String getCreateBy() {
		return get("create_by");
	}

	public void setCreateDate(java.util.Date createDate) {
		set("create_date", createDate);
	}

	public java.util.Date getCreateDate() {
		return get("create_date");
	}

	public void setUpdateBy(java.lang.String updateBy) {
		set("update_by", updateBy);
	}

	public java.lang.String getUpdateBy() {
		return get("update_by");
	}

	public void setUpdateDate(java.util.Date updateDate) {
		set("update_date", updateDate);
	}

	public java.util.Date getUpdateDate() {
		return get("update_date");
	}

	public void setRemarks(java.lang.String remarks) {
		set("remarks", remarks);
	}

	public java.lang.String getRemarks() {
		return get("remarks");
	}

	public void setDelFlag(java.lang.String delFlag) {
		set("del_flag", delFlag);
	}

	public java.lang.String getDelFlag() {
		return get("del_flag");
	}

	public void setResourcesname(java.lang.String resourcesname) {
		set("resourcesname", resourcesname);
	}

	public java.lang.String getResourcesname() {
		return get("resourcesname");
	}

	public void setPermission(java.lang.String permission) {
		set("permission", permission);
	}

	public java.lang.String getPermission() {
		return get("permission");
	}

}
