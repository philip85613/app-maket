package com.appinfosys.dao.appCategoryLevel;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.appinfosys.pojo.AppCategoryLevel2;

public interface AppCategoryLevel2Mapper {

	public List<AppCategoryLevel2> getAllAppCategoryLevel2();
	
	public List<AppCategoryLevel2> getAllAppCategoryLevel2ByParentId(@Param(value="parentId")Integer parentId);
	
	public AppCategoryLevel2 getAppCategoryLevel2ById(@Param(value="id") Integer id);
}
