package com.appinfosys.pojo;

import java.util.Date;

/*
 * app用户实体类
 */
public class AppUser {
	
	private Integer id;//用户编码
	private String appUserCode;//用户登录名
	private String appUserName;//用户真实姓名
	private String appUserPassword;//用户登录密码
	private char appUserSex;//用户性别
	private Integer createBy;//用户创建id
	private Date creationDate;//用户创建日期
	private String appUserPhoneNum;//用户手机号
	private Date appUserBirthday;//用户出生日期
	private String appUserPicPath;//用户照片地址
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAppUserCode() {
		return appUserCode;
	}
	public void setAppUserCode(String appUserCode) {
		this.appUserCode = appUserCode;
	}
	public String getAppUserName() {
		return appUserName;
	}
	public void setAppUserName(String appUserName) {
		this.appUserName = appUserName;
	}
	public String getAppUserPassword() {
		return appUserPassword;
	}
	public void setAppUserPassword(String appUserPassword) {
		this.appUserPassword = appUserPassword;
	}
	public char getAppUserSex() {
		return appUserSex;
	}
	public void setAppUserSex(char appUserSex) {
		this.appUserSex = appUserSex;
	}
	public Integer getCreateBy() {
		return createBy;
	}
	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getAppUserPhoneNum() {
		return appUserPhoneNum;
	}
	public void setAppUserPhoneNum(String appUserPhoneNum) {
		this.appUserPhoneNum = appUserPhoneNum;
	}
	public Date getAppUserBirthday() {
		return appUserBirthday;
	}
	public void setAppUserBirthday(Date appUserBirthday) {
		this.appUserBirthday = appUserBirthday;
	}
	public String getAppUserPicPath() {
		return appUserPicPath;
	}
	public void setAppUserPicPath(String appUserPicPath) {
		this.appUserPicPath = appUserPicPath;
	}
	
}
