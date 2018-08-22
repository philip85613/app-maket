package com.appinfosys.dao.backendUser;

import org.apache.ibatis.annotations.Param;

import com.appinfosys.pojo.BackendUser;

public interface BackendUserMapper {

	public BackendUser getBackendUserByUserCode(@Param("userCode")String userCode);
}
