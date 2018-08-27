package com.appinfosys.service.appFlatform.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appinfosys.dao.appFlatform.AppFlatformMapper;
import com.appinfosys.pojo.AppFlatform;
import com.appinfosys.service.appFlatform.AppFlatformService;

@Service
public class AppFlatformServiceImpl implements AppFlatformService{

	@Resource
	private AppFlatformMapper appFlatformMapper;

	@Override
	public List<AppFlatform> getAllAppFlatform() {
		return appFlatformMapper.getAllAppFlatform();
	}
	
}
