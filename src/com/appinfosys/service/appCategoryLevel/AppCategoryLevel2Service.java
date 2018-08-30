package com.appinfosys.service.appCategoryLevel;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.appinfosys.pojo.AppCategoryLevel2;

public interface AppCategoryLevel2Service {

	public List<AppCategoryLevel2> getAllAppCategoryLevel2();
	
	public List<AppCategoryLevel2> getAllAppCategoryLevel2ByParentId(Integer parentId);
	
	public AppCategoryLevel2 getAppCategoryLevel2ById(Integer id);
}
