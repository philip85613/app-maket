package com.appinfosys.service.appuser;

import com.appinfosys.pojo.AppUser;

public interface AppUserService {

	public AppUser getAppUser(String appUserCode,String appUserPassword);
	
	public int addAppUser(String appUserCode,String appUserName,String appUserPassword,String appUserPhoneNum);
	
	public AppUser getAppUserInfo(String appUserCode);
}
