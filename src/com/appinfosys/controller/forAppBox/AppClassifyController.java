package com.appinfosys.controller.forAppBox;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.appinfosys.pojo.AppCategoryLevel1;
import com.appinfosys.pojo.AppCategoryLevel2;
import com.appinfosys.pojo.AppInfo;
import com.appinfosys.service.appCategoryLevel.AppCategoryLevel1Service;
import com.appinfosys.service.appCategoryLevel.AppCategoryLevel2Service;
import com.appinfosys.service.appInfo.AppInfoService;

@Controller
@RequestMapping("/appclassify")
public class AppClassifyController {
	@Resource
	private AppCategoryLevel1Service appCategoryLevel1Service;
	@Resource
	private AppCategoryLevel2Service appCategoryLevel2Service;
	@Resource
	private AppInfoService appInfoService;
	private Logger log=Logger.getLogger(AppClassifyController.class);
	
	@RequestMapping("/appcategorylevel1.json")
	@ResponseBody
	public Object getAppCategoryLevel1(){
		log.debug("getAppCategoryLevel1>>>>>>>>>>>>>>>>>>>>>>>");
		List<AppCategoryLevel1> appCategoryLevel1List=null;
		appCategoryLevel1List=appCategoryLevel1Service.getAllAppCategoryLevel1();
		log.debug("JSON.toJSON(appCategoryLevel1List)>>>>>>>>>>>>>"+JSON.toJSON(appCategoryLevel1List));
		return JSON.toJSON(appCategoryLevel1List);
	}
	
	@RequestMapping("/appcategorylevel2.json")
	@ResponseBody
	public Object getAppCategoryLevel2(@RequestParam(value="parentId") String parentId){
		log.debug("getAppCategoryLevel2>>>>>>>>>>>>>>>>>>>>");
		List<AppCategoryLevel2> appCategoryLevel2List=null;
		log.debug("parentId>>>>"+parentId);
		appCategoryLevel2List=appCategoryLevel2Service.getAllAppCategoryLevel2ByParentId(Integer.parseInt(parentId));
		log.debug("JSON.toJSON(appCategoryLevel2List>>>>>>>>>>>>"+JSON.toJSON(appCategoryLevel2List));
		return JSON.toJSON(appCategoryLevel2List);
	}
	
	@RequestMapping("/appinfolist.json")
	@ResponseBody
	public Object getAppInfoListByCategoryLevel(@RequestParam(value="categoryLevel1") Integer categoryLevel1,
								 @RequestParam(value="categoryLevel2") Integer categoryLevel2){
		log.debug("getAppSoftware>>>>>>>>>>>>>>>>>>>>>>>>>");
		log.debug("categoryLevel1>>>>>>>>>>>>>>>>>>>>>>>"+categoryLevel1);
		log.debug("categoryLevel2>>>>>>>>>>>>>>>>>>>>>>>"+categoryLevel2);
		List<AppInfo> appInfoList=null;
		appInfoList=appInfoService.getAppInfoListByCategoryLevel(categoryLevel1, categoryLevel2);
		log.debug("JSON.toJSON(appInfo)>>>>>>>>>>>>>>>>>>>>>>>>"+JSON.toJSON(appInfoList));
		return JSON.toJSON(appInfoList);
	}
	
	@RequestMapping("/appcategorylevel2ById.json")
	@ResponseBody
	public Object getAppCategorylevel2ById(@RequestParam(value="id") Integer id){
		log.debug("getAppCategorylevel2ById>>>>>>>>>>>>>>>>>>>>");
		AppCategoryLevel2 appCategoryLevel2=null;
		appCategoryLevel2=appCategoryLevel2Service.getAppCategoryLevel2ById(id);
		log.debug("JSON.toJSON(appCategoryLevel2)>>>>>>>>>>>>>>>>>>>>>"+JSON.toJSON(appCategoryLevel2));
		return JSON.toJSON(appCategoryLevel2);
	}
	
}
