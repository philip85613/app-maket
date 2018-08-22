package com.appinfosys.service.backendUser.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appinfosys.dao.backendUser.BackendUserMapper;
import com.appinfosys.pojo.BackendUser;
import com.appinfosys.service.backendUser.BackendUserService;

@Service
public class BackendUserServiceImpl implements BackendUserService{
	
	@Resource
	private BackendUserMapper backendUserMapper;

	@Override
	public BackendUser doLogin(String userCode, String userPassword) {
		BackendUser backendUser = backendUserMapper.getBackendUserByUserCode(userCode);
		if(backendUser != null){
			if(!backendUser.getUserPassword().equals(userPassword)){
				backendUser = null;
			}
		}
		return backendUser;
	}
}
