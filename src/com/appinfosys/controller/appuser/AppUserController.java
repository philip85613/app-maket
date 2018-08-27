package com.appinfosys.controller.appuser;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.appinfosys.controller.dev.DevController;
import com.appinfosys.pojo.AppUser;
import com.appinfosys.service.appuser.AppUserService;
import com.appinfosys.tools.Constants;
import com.mysql.jdbc.StringUtils;
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
		log.debug("appUserLogin>>>>>>>>>>>>>>>>>>>>>");
		AppUser appUser=null;
		HttpSession session=request.getSession();
		log.debug("appUserCode>>>>>>>>>>>>>>"+appUserCode);
		log.debug("appUserPassword>>>>>>>>>>>>>>"+appUserPassword);
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
		AppUser appUser=null;
		appUser=appUserService.getAppUser(appUserCode, appUserPassword);
		if(appUser==null){
			if(appUserCode!=null&&appUserName!=null&&appUserPassword!=null&&appUserPhoneNum!=null&&appUserPhoneNum!=""){
				result=appUserService.addAppUser(appUserCode, appUserName, appUserPassword, appUserPhoneNum);
				return result;
			}else{
				return 0;
			}
		}else{
			return -1;
		}
		
	}
	@RequestMapping("/appuserinfo.json")
	@ResponseBody
	public Object appUserInfo(@RequestParam(value="appUserCode") String appUserCode){
		log.debug("appUserInfo>>>>>>>>>>>>>>>>>>>>>>>>>>");
		AppUser appUser=null;
		appUser=appUserService.getAppUserInfo(appUserCode);
		return JSON.toJSON(appUser);
	}
	@RequestMapping("/aucexist.json")
	@ResponseBody
	public Object appUserCodeExist(@RequestParam(value="appUserCode") String appUserCode){
		log.debug("appUserCodeExist>>>>>>>>>>>>>>>>>>>>>>>>");
		AppUser appUser=null;
		Map<Object,Object> appUserMap=new HashMap<Object,Object>();
		if(StringUtils.isNullOrEmpty(appUserCode)){
			appUserMap.put("appUserCode", "null");
		}else{
			appUser=appUserService.getAppUserInfo(appUserCode);
			if(appUser!=null){
				appUserMap.put("appUserCode", "exist");
			}else{
				appUserMap.put("appUserCode", "noexist");
			}
		}
		return JSONArray.toJSON(appUserMap);
	}
}
