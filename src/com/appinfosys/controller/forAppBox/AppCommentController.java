package com.appinfosys.controller.forAppBox;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appinfosys.service.appComment.AppCommentService;

@Controller
@RequestMapping("/appComment")
public class AppCommentController {
	
	@Resource
	private AppCommentService appCommentService;
}
