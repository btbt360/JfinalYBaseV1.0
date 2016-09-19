package com.wide.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseOffice<M extends BaseOffice<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}

	public java.lang.String getId() {
		return get("id");
	}

	public void setParentId(java.lang.String parentId) {
		set("parent_id", parentId);
	}

	public java.lang.String getParentId() {
		return get("parent_id");
	}

	public void setParentIds(java.lang.String parentIds) {
		set("parent_ids", parentIds);
	}

	public java.lang.String getParentIds() {
		return get("parent_ids");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setSort(java.lang.Double sort) {
		set("sort", sort);
	}

	public java.lang.Double getSort() {
		return get("sort");
	}

	public void setAreaId(java.lang.String areaId) {
		set("area_id", areaId);
	}

	public java.lang.String getAreaId() {
		return get("area_id");
	}

	public void setCode(java.lang.String code) {
		set("code", code);
	}

	public java.lang.String getCode() {
		return get("code");
	}

	public void setType(java.lang.String type) {
		set("type", type);
	}

	public java.lang.String getType() {
		return get("type");
	}

	public void setGrade(java.lang.String grade) {
		set("grade", grade);
	}

	public java.lang.String getGrade() {
		return get("grade");
	}

	public void setAddress(java.lang.String address) {
		set("address", address);
	}

	public java.lang.String getAddress() {
		return get("address");
	}

	public void setZipCode(java.lang.String zipCode) {
		set("zip_code", zipCode);
	}

	public java.lang.String getZipCode() {
		return get("zip_code");
	}

	public void setMaster(java.lang.String master) {
		set("master", master);
	}

	public java.lang.String getMaster() {
		return get("master");
	}

	public void setPhone(java.lang.String phone) {
		set("phone", phone);
	}

	public java.lang.String getPhone() {
		return get("phone");
	}

	public void setFax(java.lang.String fax) {
		set("fax", fax);
	}

	public java.lang.String getFax() {
		return get("fax");
	}

	public void setEmail(java.lang.String email) {
		set("email", email);
	}

	public java.lang.String getEmail() {
		return get("email");
	}

	public void setUSEABLE(java.lang.String USEABLE) {
		set("USEABLE", USEABLE);
	}

	public java.lang.String getUSEABLE() {
		return get("USEABLE");
	}

	public void setPrimaryPerson(java.lang.String primaryPerson) {
		set("PRIMARY_PERSON", primaryPerson);
	}

	public java.lang.String getPrimaryPerson() {
		return get("PRIMARY_PERSON");
	}

	public void setDeputyPerson(java.lang.String deputyPerson) {
		set("DEPUTY_PERSON", deputyPerson);
	}

	public java.lang.String getDeputyPerson() {
		return get("DEPUTY_PERSON");
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

}
