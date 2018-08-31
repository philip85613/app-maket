package com.appinfosys.dao.appComment;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.appinfosys.pojo.AppComment;

public interface AppCommentMapper {

	/**
	 * 获取所有某id的app的所有评论
	 * @return
	 */
	public List<AppComment>	getAppCommentsByAppId(@Param(value="appId")Integer appId);
	/**
	 * 为某id的app增加一条评论
	 * @param appId
	 * @return
	 */
	public int addAppComment(@Param(value="appId")Integer appId,
							 @Param(value="appUserId")Integer appUserId,
							 @Param(value="commentInfo")String commentInfo,
							 @Param(value="addDate")Date addDate);
}
