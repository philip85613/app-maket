package com.appinfosys.service.appCategoryLevel;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appinfosys.dao.appCategoryLevel.AppCategoryLevel1Mapper;
import com.appinfosys.pojo.AppCategoryLevel1;

@Service
public class AppCategoryLevel1ServiceImpl implements AppCategoryLevel1Service{

	@Resource
	private AppCategoryLevel1Mapper appCategoryLevel1Mapper;
	@Override
	public List<AppCategoryLevel1> getAllAppCategoryLevel1() {
		return appCategoryLevel1Mapper.getAllAppCategoryLevel1();
	}

}
