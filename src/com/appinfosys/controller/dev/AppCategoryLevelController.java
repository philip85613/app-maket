package com.appinfosys.controller.dev;

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
public class AppCategoryLevelController {

	private static Logger log = Logger.getLogger(AppCategoryLevelController.class);
	
	@Resource
	private AppCategoryLevel1Service appCategoryLevel1Service;
	@Resource
	private AppCategoryLevel2Service appCategoryLevel2Service;
	/**
	 * 获得一级分类
	 * @return
	 */
	@RequestMapping("/getAppCategoryLevel1.json")
	@ResponseBody
	public Object getAppCategoryLevel1(){
		log.debug("进入getAppCategoryLevel1==================================");
		List<AppCategoryLevel1> appCategoryLevel1 = appCategoryLevel1Service.getAllAppCategoryLevel1();
		log.debug("AppCategoryLevel1=================================="+appCategoryLevel1.size());
		return JSON.toJSON(appCategoryLevel1);
	}
	/**
	 * 根据一级分类获得二级分类
	 * @param optionValueLevel1
	 * @return
	 */
	@RequestMapping("/getAppCategoryLevel2.json")
	@ResponseBody
	public Object getAppCategoryLevel12(@RequestParam(value="optionValueLevel1")Integer optionValueLevel1){
		log.debug("进入getAppCategoryLevel2==================================");
		List<AppCategoryLevel2> appCategoryLevel2 = appCategoryLevel2Service.getAllAppCategoryLevel2ByParentId(optionValueLevel1);
		log.debug("AppCategoryLevel2=================================="+appCategoryLevel2.size());
		return JSON.toJSON(appCategoryLevel2);
	}
}
