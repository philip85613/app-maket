package com.appinfosys.service.appComment;

import java.util.List;

import com.appinfosys.pojo.AppComment;

public interface AppCommentService {

	public List<AppComment>	getAppCommentsByAppId(Integer appId);
}
