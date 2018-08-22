package com.appinfosys.controller.backendUser;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appinfosys.service.appInfo.AppInfoService;

@Controller
@RequestMapping("/backendUser")
public class BackendUserController {
	private Logger log = Logger.getLogger(BackendUserController.class);
	
	@Resource
	private AppInfoService appInfoService;

	@RequestMapping("/backendUserMain")
	public String backendUserMain(){
		return "backendUser/backendUserMain";
	}
	
	@RequestMapping("/backendUserAppInfo")
	public String backendUserAppInfo(){
		return "backendUser/backendUserAppInfo";
	}
}
