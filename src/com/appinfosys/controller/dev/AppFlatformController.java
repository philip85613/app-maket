package com.appinfosys.controller.dev;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.appinfosys.pojo.AppFlatform;
import com.appinfosys.service.appFlatform.AppFlatformService;

@Controller
public class AppFlatformController {

	private static Logger log = Logger.getLogger(AppInfoController.class);
	
	@Resource
	private AppFlatformService appFlatformService;
	
	@RequestMapping(value="/getAppFlatform.json")
	@ResponseBody
	public Object getAppFlatform(){
		log.debug("进入getAppFlatform=========================>");
		List<AppFlatform> appFlatformList = appFlatformService.getAllAppFlatform();
		log.debug("进入appFlatformList=========================>"+appFlatformList.size());
		return JSON.toJSON(appFlatformList);
	}
}
