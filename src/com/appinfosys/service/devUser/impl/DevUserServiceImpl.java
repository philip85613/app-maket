package com.appinfosys.service.devUser.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appinfosys.dao.devUser.DevUserMapper;
import com.appinfosys.pojo.DevUser;
import com.appinfosys.service.devUser.DevUserService;

@Service
public class DevUserServiceImpl implements DevUserService {

	@Resource
	private DevUserMapper devUserMapper;

	@Override
	public DevUser doLogin(String devCode, String devPassword) {
		DevUser devUser = devUserMapper.getDevUserByDevCode(devCode);
		if(null != devUser){
			if(!devUser.getDevPassword().equals(devPassword)){
				devUser = null;
			}
		}
		return devUser;
	}
}
