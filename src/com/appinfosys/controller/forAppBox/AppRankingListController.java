package com.appinfosys.controller.forAppBox;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.appinfosys.pojo.AppInfo;
import com.appinfosys.service.appInfo.AppInfoService;

@Controller
@RequestMapping("/rankinglist")
public class AppRankingListController {
	@Resource
	private AppInfoService appInfoService;
	private Logger log=Logger.getLogger(AppRankingListController.class);
	@RequestMapping("/appinfolist.json")
	@ResponseBody
	public Object getAppInfoList(){
		log.debug("getAppInfoList>>>>>>>>>>>>>>>");
		List<AppInfo> appInfoList=null;
		appInfoList=appInfoService.getAllAppsInfo();
		log.debug("JSON.toJSON(appInfoList)>>>>>>>>>>"+JSON.toJSON(appInfoList));
		return JSON.toJSON(appInfoList);
	}
}
