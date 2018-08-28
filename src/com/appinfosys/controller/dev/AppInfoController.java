package com.appinfosys.controller.dev;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.appinfosys.dao.appInfo.AppInfoMapper;
import com.appinfosys.pojo.AppInfo;
import com.appinfosys.service.appInfo.AppInfoService;

@Controller
//@RequestMapping("/dev")
public class AppInfoController {
	private static Logger log = Logger.getLogger(AppInfoController.class);
	
	@Resource
	private AppInfoMapper appInfoMapper;
	
	@Resource
	private	AppInfoService appInfoService;
	
	/*@RequestMapping("/data1.json")
	@ResponseBody
	public Object appInfoList(){
		log.debug("进入appInfoList==================================");
		List<AppInfo> appInfoList = appInfoMapper.getAllAppsInfo();
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("total", appInfoList.size());
		map.put("rows", appInfoList);
		log.debug("map================"+map);
		log.debug("JSON================"+JSON.toJSON(appInfoList));
		return JSON.toJSON(map);
	}*/
	/**
	 * 获得select框的value值
	 * @param optionValueLevel1
	 * @param optionValueLevel2
	 * @return
	 *//*
	@RequestMapping("/getAppCategoryValue.json")
	public Object getAppCategoryValue(@RequestParam(value="optionValueLevel1")Integer optionValueLevel1,
									  @RequestParam(value="optionValueLevel2")Integer optionValueLevel2,
									  @RequestParam(value="optionValueFlatform")Integer optionValueFlatform){
		log.debug("进入getAppCategoryValue==================================");
		List appCategoryValues = new ArrayList();
		appCategoryValues.add(optionValueLevel1);
		appCategoryValues.add(optionValueLevel2);
		appCategoryValues.add(optionValueFlatform);
		log.debug("appCategoryValues.size()=================================="+appCategoryValues.size());
		return appCategoryValues;
	}*/
	/**
	 * APP图标上传处理
	 * @param myAppLogo
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/fileUpload.json",method=RequestMethod.POST)
	@ResponseBody 
	public Object fileUpload(@RequestParam(value="myAppPic") MultipartFile myAppLogo,HttpServletRequest request){
		log.debug("进入fileUpload==================================");
		String logoLocPath = null;
		String logoPicPath = null;
		String path = request.getSession().getServletContext().getRealPath("statics"+File.separator+"uploadfiles");
		log.debug("path==================="+path);
		String fileName = System.currentTimeMillis()+"appLogo.jpg";
		File file = new File(path,fileName);
		if(!file.exists()){
			file.mkdirs();
		}
		try {
			myAppLogo.transferTo(file);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Map<Object, Object> map = new HashMap<Object, Object>();
		logoLocPath = path + File.separator + fileName;
		logoPicPath = request.getContextPath()+"/statics/uploadfiles/"+fileName;
		map.put("logoLocPath", logoLocPath);
		map.put("logoPicPath", logoPicPath);
		return JSON.toJSON(map);
	}
	
	/**
	 * 上传APP的APK
	 * @param myAppApk
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/apkFileUpload.json",method=RequestMethod.POST)
	@ResponseBody 
	public Object apkFileUpload(@RequestParam(value="myAppApk") MultipartFile myAppApk,HttpServletRequest request){
		log.debug("进入apkFileUpload==================================");
		String fileLocPath = null;
		String filePath = null;
		String path = request.getSession().getServletContext().getRealPath("statics"+File.separator+"uploadfiles");
		log.debug("path==================="+path);
		String fileName = System.currentTimeMillis()+".apk";
		File file = new File(path,fileName);
		if(!file.exists()){
			file.mkdirs();
		}
		try {
			myAppApk.transferTo(file);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Map<Object, Object> map = new HashMap<Object, Object>();
		fileLocPath = path + File.separator + fileName;
		filePath = request.getContextPath()+"/statics/uploadfiles/"+fileName;
		map.put("fileLocPath", fileLocPath);
		map.put("filePath", filePath);
		return JSON.toJSON(map);
	}
	
	@RequestMapping("/data2.json")
	@ResponseBody
	public Object appInfoListForBackendUser(){
		log.debug("进入appInfoListForBackendUser==================================");
		List<AppInfo> appInfoList = appInfoService.getAppInfoByStatusId(1);
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("total", appInfoList.size());
		map.put("rows", appInfoList);
		log.debug("map================"+map);
		log.debug("JSON================"+JSON.toJSON(appInfoList));
		return JSON.toJSON(map);
	}
	
	@RequestMapping("/doAppAdd")
	public String doAppAdd(String softwareName,String APKName,String supportROM,String interfaceLanguage,
	 							Integer softwareSize,Integer downloads,String appInfo,String logoLocPath,
	 							String logoPicPath,String fileLocPath,String filePath,Integer flatformId,
	 							Integer categoryLevel1,Integer categoryLevel2){
		appInfoMapper.addApp(softwareName, APKName, supportROM, interfaceLanguage, softwareSize, downloads, 
								appInfo, logoLocPath,logoPicPath,fileLocPath,filePath,flatformId,categoryLevel1,categoryLevel2);
		return "redirect:/dev/appinfo";
	}
	
	@RequestMapping(value="/appDelete.json")
	@ResponseBody
	public Object doAppDelete(@RequestParam String id){
		log.debug("进入doAppDelete=========================>");
		log.debug("id  "+id);
		int result = appInfoMapper.deleteApp(Integer.parseInt(id));
		log.debug("result  "+result);
		return this.appInfosList();
	}
	
	@RequestMapping(value="/appVerify.json")
	@ResponseBody
	public Object doAppVerify(@RequestParam String id){
		log.debug("进入doAppVerify=========================>");
		log.debug("id  "+id);
		int result = appInfoService.verifyAppInfoById(Integer.parseInt(id));
		log.debug("result  "+result);
		return this.appInfoListForBackendUser();
	}
	
	@RequestMapping(value="/appViewAndModify.json")
	@ResponseBody
	public Object doAppView(@RequestParam String id){
		log.debug("进入doAppView=========================>");
		log.debug("id  "+id);
		AppInfo appInfo = appInfoMapper.getAppInfoById(Integer.parseInt(id));
		log.debug("appInfo  "+appInfo);
		return JSON.toJSON(appInfo);
	}
	
	@RequestMapping("/queryAppInfo.json")
	@ResponseBody
	public Object queryAppInfo(@RequestParam String softwareName){
		log.debug("进入queryAppInfo==================================");
		log.debug("softwareName======="+softwareName);
		List<AppInfo> appInfoList = appInfoMapper.getAppInfosBySoftwareName(softwareName);
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("total", appInfoList.size());
		map.put("rows", appInfoList);
		log.debug("map================"+map);
		log.debug("JSON================"+JSON.toJSON(appInfoList));
		return JSON.toJSON(map);
	}
	
	@RequestMapping("/doAppModify.json")
	@ResponseBody
	public String doAppModify(String softwareName,String APKName,Integer statusId,String supportROM,String interfaceLanguage,
	 							Integer softwareSize,Integer downloads,String appInfo,Integer flatformId,Integer id){
		log.debug("进入doAppModify==================================");
		//List selectValues = this.getAppCategoryValue(optionValueLevel1, optionValueLevel2, optionValueFlatform)
		appInfoMapper.modifyAppInfoById(softwareName, APKName, statusId, supportROM, interfaceLanguage, softwareSize, downloads, appInfo, flatformId,id);
		return "dev/devAppInfo";
	}
	
	@RequestMapping(value="/appShangJia.json")
	@ResponseBody
	public Object doAppShangJia(@RequestParam String id){
		log.debug("进入doAppShangJia=========================>");
		log.debug("id  "+id);
		int result = appInfoMapper.shangJiaAppById(Integer.parseInt(id));
		log.debug("result  "+result);
		return this.appInfosList();
	}
	
	@RequestMapping(value="/appXiaJia.json")
	@ResponseBody
	public Object doAppXiaJia(@RequestParam String id){
		log.debug("进入doAppXiaJia=========================>");
		log.debug("id  "+id);
		int result = appInfoMapper.xiaJiaAppById(Integer.parseInt(id));
		log.debug("result  "+result);
		return this.appInfosList();
	}
	@RequestMapping("/verifySoftwareName")
	@ResponseBody
	public Object verifySoftwareName(@RequestParam String softwareName){
		log.debug("进入queryAppInfo==================================");
		log.debug("softwareName======="+softwareName);
		AppInfo appInfo = appInfoService.getAppInfoBySoftWareName(softwareName);
		Map<Object, Object> map = null;
		if(null != appInfo){
			map = new HashMap<Object, Object>();
			map.put("msg", "软件名称已存在!请重新输入!");
		}else{
			map = new HashMap<Object, Object>();
			map.put("msg", "软件名称可以使用!");
		}
		log.debug("map================"+map);
		return JSON.toJSON(map);
	}
	
	@RequestMapping("/data1.json")
	@ResponseBody
	public Object appInfosList(){
		log.debug("进入appInfosList==================================");
		List<AppInfo> appInfoList = appInfoService.getAllAppInfo();
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("total", appInfoList.size());
		map.put("rows", appInfoList);
		log.debug("map================"+map);
		log.debug("JSON================"+JSON.toJSON(appInfoList));
		return JSON.toJSON(map);
	}
}
