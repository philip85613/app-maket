package com.appinfosys.service.appCategoryLevel;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appinfosys.dao.appCategoryLevel.AppCategoryLevel2Mapper;
import com.appinfosys.pojo.AppCategoryLevel2;

@Service
public class AppCategoryLevel2ServiceImpl implements AppCategoryLevel2Service {

	@Resource
	AppCategoryLevel2Mapper appCategoryLevel2Mapper;
	
	@Override
	public List<AppCategoryLevel2> getAllAppCategoryLevel2() {
		return appCategoryLevel2Mapper.getAllAppCategoryLevel2();
	}

	@Override
	public List<AppCategoryLevel2> getAllAppCategoryLevel2ByParentId(
			Integer parentId) {
		return appCategoryLevel2Mapper.getAllAppCategoryLevel2ByParentId(parentId);
	}

	@Override
	public AppCategoryLevel2 getAppCategoryLevel2ById(Integer id) {
		return appCategoryLevel2Mapper.getAppCategoryLevel2ById(id);
	}
}
