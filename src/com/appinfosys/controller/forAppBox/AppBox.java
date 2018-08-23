package com.appinfosys.controller.forAppBox;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.appinfosys.pojo.AppInfo;
import com.appinfosys.service.appInfo.AppInfoService;

@Controller
@RequestMapping("/appbox")
public class AppBox {

	private static Logger log = Logger.getLogger(AppBox.class);
	
	@Resource
	private	AppInfoService appInfoService;
	
	@RequestMapping("/appList")
	@ResponseBody
	public Object getAppList(){
		log.debug("进入getAppList==================================");
		List<AppInfo> appInfoList = appInfoService.getAppInfoByStatusIdIsFour();
		log.info("map======================="+JSON.toJSON(appInfoList));
		return JSON.toJSON(appInfoList);
	}
	
	
	@RequestMapping("/appInfo")
	@ResponseBody
	public Object getAppInfo(@RequestParam String id){
		log.debug("进入getAppInfo==================================");
		AppInfo appInfo = appInfoService.getAppInfoById(Integer.parseInt(id));
		log.info("appInfo======================="+JSON.toJSON(appInfo));
		return JSON.toJSON(appInfo);
	}
	
	@RequestMapping("/queryAppInfo")
	@ResponseBody
	public Object queryAppInfo(@RequestParam String softwareName){
		log.debug("进入queryAppInfo==================================");
		log.debug("softwareName======="+softwareName);
		List<AppInfo> appInfoList = appInfoService.getAppInfosBySoftwareName(softwareName);
		//log.info("appInfoList======================="+JSON.toJSON(appInfoList));
		//log.info("appInfoList.size()======================="+appInfoList.size());
		/*Map<String, String> map = null;
		if(appInfoList.size()==0){
			log.debug("进入if==================================");
			map = new HashMap<String, String>();
			map.put("msg", "没有相关的软件!");
			return JSON.toJSON(map);
		}*/
		return JSON.toJSON(appInfoList);
	}
}
