package com.appinfosys.service.appComment.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appinfosys.dao.appComment.AppCommentMapper;
import com.appinfosys.pojo.AppComment;
import com.appinfosys.service.appComment.AppCommentService;

@Service
public class AppCommentServiceImpl implements AppCommentService{
	@Resource
	private AppCommentMapper appCommentMapper;

	@Override
	public List<AppComment> getAppCommentsByAppId(Integer appId) {
		return appCommentMapper.getAppCommentsByAppId(appId);
	}

	@Override
	public int addAppComment(Integer appId, Integer appUserId,String commentInfo) {
		return appCommentMapper.addAppComment(appId, appUserId, commentInfo);
	}
}
