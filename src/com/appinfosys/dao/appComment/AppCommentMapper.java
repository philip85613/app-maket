package com.appinfosys.dao.appComment;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.appinfosys.pojo.AppComment;

public interface AppCommentMapper {

	/**
	 * 获取所有某id的app的所有评论
	 * @return
	 */
	public List<AppComment>	getAppCommentsByAppId(@Param(value="appId")Integer appId);
}
