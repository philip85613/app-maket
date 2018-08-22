package com.appinfosys.dao.devUser;

import org.apache.ibatis.annotations.Param;

import com.appinfosys.pojo.DevUser;

public interface DevUserMapper {

	public DevUser getDevUserByDevCode(@Param("devCode")String devCode);
}
