package com.appinfosys.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.appinfosys.pojo.DevUser;
import com.appinfosys.tools.Constants;

public class SysInterceptor extends HandlerInterceptorAdapter {
	private static Logger log = Logger.getLogger(SysInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		log.debug("进入preHandle==================================>");
		DevUser devUser = (DevUser) request.getSession().getAttribute(Constants.DEV_USER_SESSION);
		if(null == devUser){
			response.sendRedirect(request.getContextPath()+"/401.jsp");
			return false;
		}
		return true;
	}
}
