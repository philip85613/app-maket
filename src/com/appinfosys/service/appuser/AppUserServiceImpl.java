package com.appinfosys.service.appuser;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appinfosys.dao.appuser.AppUserMapper;
import com.appinfosys.pojo.AppUser;

@Service
public class AppUserServiceImpl implements AppUserService{
	@Resource
	private AppUserMapper appUserMapper;
	@Override
	public AppUser getAppUser(String appUserCode, String appUserPassword) {
		AppUser appUser=null;
		appUser=appUserMapper.getAppUser(appUserCode);
		if(appUser!=null){
			if(!appUser.getAppUserPassword().equals(appUserPassword)){
				return null;
			}
		}
		return appUser;
	}
	@Override
	public int addAppUser(String appUserCode, String appUserName,
			String appUserPassword, String appUserPhoneNum) {
		int result=0;
		result=appUserMapper.addAppUser(appUserCode, appUserName, appUserPassword, appUserPhoneNum);
		return result;
	}
	@Override
	public AppUser getAppUserInfo(String appUserCode) {
		return appUserMapper.getAppUser(appUserCode);
	}

}
