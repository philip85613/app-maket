package com.appinfosys.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.appinfosys.pojo.BackendUser;
import com.appinfosys.service.backendUser.BackendUserService;
import com.appinfosys.tools.Constants;

@Controller
public class BackendUserLoginController {

	@Resource
	private BackendUserService backendUserService;
	
	@RequestMapping("/toLoginForBackendUser")
	public String toLoginForBackendUser(){
		return "backendUser/backendUserLogin";
	}
	
	@RequestMapping("/doLoginForBackendUser")
	public String doLoginForBackendUser(@RequestParam("userCode")String userCode,@RequestParam("userPassword")String userPassword,
										HttpSession session,HttpServletRequest request){
		BackendUser backendUser = backendUserService.doLogin(userCode, userPassword);
		if(null != backendUser){
			session.setAttribute(Constants.BACKEND_USER_SESSION, backendUser);
			return "redirect:/backendUser/backendUserMain";
		}
		return "backendUser/backendUserLogin";
	}
}
