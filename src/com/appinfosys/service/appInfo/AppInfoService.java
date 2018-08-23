package com.appinfosys.service.appInfo;

import java.util.List;

import com.appinfosys.pojo.AppInfo;

public interface AppInfoService {

	public List<AppInfo> getAppInfoList(String querySoftwareName,Integer queryStatus,
			Integer queryCategoryLevel1,Integer queryCategoryLevel2,
			Integer queryCategoryLevel3,Integer queryFlatformId,
			Integer devId);
	
	public List<AppInfo> getAllAppsInfo();
	
	public int addApp(String softwareName,String APKName,String supportROM,String interfaceLanguage,
		 	 			Integer softwareSize,Integer downloads,String appInfo,String logoLocPath,String logoPicPath);
	
	public int deleteApp(Integer id);
	
	public AppInfo getAppInfoById(Integer id);
	
	public List<AppInfo> getAppInfosBySoftwareName(String softwareName);
	
	public int modifyApp(String softwareName,String APKName,Integer statusId,String supportROM,String interfaceLanguage,
	 			Integer softwareSize,Integer downloads,String appInfo,Integer flatformId,Integer id);
	
	public List<AppInfo> getAppInfoByStatusId(Integer statusId);
	
	public int verifyAppInfoById(Integer statusId);
	
	public int shangJiaAppById(Integer id);
	
	public int xiaJiaAppById(Integer id);
	
	public AppInfo getAppInfoBySoftWareName(String softwareName);
	
	public List<AppInfo> getAppInfoOrderByDownloads();
	
	public List<AppInfo> getAppInfoByStatusIdIsFour();
}
