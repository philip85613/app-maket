package com.appinfosys.service.devUser;

import com.appinfosys.pojo.DevUser;

public interface DevUserService {

	public DevUser doLogin(String devCode,String devPassword);
}
