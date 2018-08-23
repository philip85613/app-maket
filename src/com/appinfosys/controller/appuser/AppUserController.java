package com.appinfosys.controller.appuser;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.appinfosys.controller.dev.DevController;
import com.appinfosys.pojo.AppUser;
import com.appinfosys.service.appuser.AppUserService;
import com.appinfosys.tools.Constants;
@Controller
@RequestMapping("/appuser")
public class AppUserController {
	private static Logger log = Logger.getLogger(DevController.class);
	@Resource
	private AppUserService appUserService;
	@RequestMapping("/appuserlogin.json")
	@ResponseBody
	public Object appUserLogin(@RequestParam(value="appUserCode")String appUserCode,
							   @RequestParam(value="appUserPassword")String appUserPassword,
							   HttpServletRequest request){
		AppUser appUser=null;
		HttpSession session=request.getSession();
		appUser=appUserService.getAppUser(appUserCode, appUserPassword);
		if(appUser!=null){
			session.setAttribute(Constants.APP_USER_SESSION, appUser);
		}
		return JSON.toJSON(appUser);
	}
	@RequestMapping("/appUserRegister.json")
	@ResponseBody
	public Object appUserRegister(@RequestParam(value="appUserCode") String appUserCode,
								  @RequestParam(value="appUserName") String appUserName,
								  @RequestParam(value="appUserPassword") String appUserPassword,
								  @RequestParam(value="appUserPhoneNum") String appUserPhoneNum){
		log.debug("appUserRegister===============");
		int result=0;
		result=appUserService.addAppUser(appUserCode, appUserName, appUserPassword, appUserPhoneNum);
		return null;
	}
}
