package com.appinfosys.controller.dev;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appinfosys.pojo.AppInfo;
import com.appinfosys.service.appInfo.AppInfoService;
import com.appinfosys.tools.Constants;

@Controller
@RequestMapping("/dev")
public class DevController {
	private static Logger log = Logger.getLogger(DevController.class);
	
	@Resource
	private AppInfoService appInfoService;
	
	@RequestMapping("/appinfo")
	public String appinfo(){
		return "dev/devAppInfo";
	}
	
	@RequestMapping("/main")
	public String main(HttpSession session){
		if(session.getAttribute(Constants.DEV_USER_SESSION) == null){
			return "redirect:devlogin";
		}
		return "dev/devMain";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		session.removeAttribute(Constants.DEV_USER_SESSION);
		return "dev/devlogin2";
	}
	
	@RequestMapping("/toappinfoadd")
	public String toappinfoadd(@ModelAttribute("appInfo")AppInfo appInfo){
		return "dev/devAppInfoAdd";
	}
}