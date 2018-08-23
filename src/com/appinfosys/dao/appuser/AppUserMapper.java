package com.appinfosys.dao.appuser;

import org.apache.ibatis.annotations.Param;

import com.appinfosys.pojo.AppUser;

public interface AppUserMapper {
	//根据用户登录名获得用户信息
	public AppUser getAppUser(@Param("appUserCode") String appUserCode);
	//添加用户信息
	public int addAppUser(@Param("appUserCode") String appUserCode,
						  @Param("appUserName") String appUserName,
						  @Param("appUserPassword") String appUserPassword,
						  @Param("appUserPhoneNum") String appUserPhoneNum);
}
