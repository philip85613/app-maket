package com.appinfosys.controller.appuser;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appinfosys.controller.dev.DevController;

@Controller
public class AppDownloadController {

	private static Logger log = Logger.getLogger(DevController.class);
	
	@RequestMapping(value="/downloadFile")
	public String downloads(HttpServletResponse response) throws Exception{
		log.debug("进入downloads方法===================================");
		String	path = "C:/Users/admin/Desktop/app-box/APK图标";
		String  fileName = "下载.jpg";
		File file = new File(path,fileName);
		
		response.reset();
		response.setHeader("Access-Control-Allow-Origin", "*"); 
		response.setCharacterEncoding("UTF-8");
		response.setContentType("multipart/form-data");
		response.setHeader("Content-Disposition", 
				"attachment;fileName="+URLEncoder.encode(fileName, "UTF-8"));
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
