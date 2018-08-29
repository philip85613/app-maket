package com.appinfosys.controller.forAppBox;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.appinfosys.pojo.AppCategoryLevel1;
import com.appinfosys.pojo.AppCategoryLevel2;
import com.appinfosys.service.appCategoryLevel.AppCategoryLevel1Service;
import com.appinfosys.service.appCategoryLevel.AppCategoryLevel2Service;

@Controller
@RequestMapping("/appclassify")
public class AppClassifyController {
	@Resource
	private AppCategoryLevel1Service appCategoryLevel1Service;
	@Resource
	private AppCategoryLevel2Service appCategoryLevel2Service;
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
}
