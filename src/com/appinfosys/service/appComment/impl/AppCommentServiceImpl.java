package com.appinfosys.service.appComment.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.appinfosys.dao.appComment.AppCommentMapper;
import com.appinfosys.pojo.AppComment;
import com.appinfosys.service.appComment.AppCommentService;

@Service
public class AppCommentServiceImpl implements AppCommentService{
	private AppCommentMapper appCommentMapper;

	@Override
	public List<AppComment> getAppCommentsByAppId(Integer appId) {
		return appCommentMapper.getAppCommentsByAppId(appId);
	}
}
