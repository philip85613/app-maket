package com.appinfosys.service.backendUser;

import com.appinfosys.pojo.BackendUser;

public interface BackendUserService {

	public BackendUser doLogin(String userCode,String userPassword);
}
