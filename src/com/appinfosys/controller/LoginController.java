package com.appinfosys.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.appinfosys.controller.dev.DevController;
import com.appinfosys.pojo.DevUser;
import com.appinfosys.service.devUser.DevUserService;
import com.appinfosys.tools.Constants;

@Controller
public class LoginController {
	private static Logger log = Logger.getLogger(DevController.class);

	@Resource
	private DevUserService devUserService;
	
	@RequestMapping("/toLogin")
	public String toLogin(){
		log.debug("进入toLogin方法===================================");
		return "dev/devlogin2";
	}
	
	@RequestMapping("/doLogin")
	public String doLogin(@RequestParam("devCode")String devCode,@RequestParam("devPassword")String devPassword,
							HttpSession session,HttpServletRequest request){
		log.debug("进入doDevLogin====================================");
		DevUser devUser = devUserService.doLogin(devCode, devPassword);
		if(null != devUser){
			session.setAttribute(Constants.DEV_USER_SESSION, devUser);
			return "redirect:/dev/main";
		}else{
			//request.setAttribute("error", "用户名或密码错误!");
			return "dev/devlogin2";
		}
	}
}
