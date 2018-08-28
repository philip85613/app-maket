package com.appinfosys.controller.appuser;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.appinfosys.controller.dev.DevController;
import com.appinfosys.pojo.AppInfo;
import com.appinfosys.service.appInfo.AppInfoService;

@Controller
public class AppDownloadController {

	private static Logger log = Logger.getLogger(DevController.class);
	
	@Resource
	private	AppInfoService appInfoService;
	/**
	 * APK文件下载
	 * @param id
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/downloadFile")
	public String downloads(@RequestParam(value="id")String id,HttpServletResponse response) throws Exception{
		log.debug("进入downloads方法===================================");
		log.debug("id==================================="+id);
		AppInfo appInfo = appInfoService.getAppInfoById(Integer.valueOf(id));
		//String	path = "C:/Users/admin/Desktop/app-box/APK图标";
		String path = appInfo.getFileLocPath();
		String  fileName = path.substring(path.lastIndexOf("/") + 1);
		File file1 = new File(fileName);
		log.debug("fileName==================================="+file1.getName());
		//String  fileName = "下载.jpg";
		//File file = new File(path,fileName);
		File file = new File(path);
		response.reset();
		response.setHeader("Access-Control-Allow-Origin", "*"); 
		response.setCharacterEncoding("UTF-8");
		response.setContentType("multipart/form-data");
		response.setHeader("Content-Disposition", 
				"attachment;fileName="+URLEncoder.encode(file1.getName(), "UTF-8"));
		InputStream input=new FileInputStream(file);
		OutputStream out = response.getOutputStream();
		byte[] buff =new byte[1024];
		int index=0;
		while((index= input.read(buff))!= -1){
			out.write(buff, 0, index);
			out.flush();
		}
		out.close();
		input.close();
		return null;
	}
}
