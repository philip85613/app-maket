package com.appinfosys.controller.forAppBox;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.appinfosys.pojo.AppComment;
import com.appinfosys.service.appComment.AppCommentService;

@Controller
@RequestMapping("/appComment")
public class AppCommentController {
	
	private static Logger log = Logger.getLogger(AppCommentController.class);
	
	@Resource
	private AppCommentService appCommentService;
	
	@RequestMapping("/appComments")
	@ResponseBody
	public Object getAppComments(@RequestParam Integer id){
		log.debug("进入getAppComments=======================");
		List<AppComment> appComments = appCommentService.getAppCommentsByAppId(id);
		return JSON.toJSON(appComments);
	}
	
	@RequestMapping("/addComment")
	@ResponseBody
	public Object addComment(Integer appId,Integer appUserId,String commentInfo,Date addDate){
		log.info("进入addComment=======================");
		log.info("进入appId======================="+appId);
		log.info("进入appUserId======================="+appUserId);
		log.info("进入commentInfo======================="+commentInfo);
		addDate = new Date();
		int result = appCommentService.addAppComment(appId, appUserId, commentInfo,addDate);
		return this.getAppComments(appId);
	}
}
