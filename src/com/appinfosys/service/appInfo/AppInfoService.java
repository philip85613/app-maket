package com.appinfosys.service.appInfo;

import java.util.Date;
import java.util.List;

import com.appinfosys.pojo.AppInfo;

public interface AppInfoService {

	public List<AppInfo> getAppInfoList(String querySoftwareName,Integer queryStatus,
			Integer queryCategoryLevel1,Integer queryCategoryLevel2,
			Integer queryCategoryLevel3,Integer queryFlatformId,
			Integer devId);
	
	public List<AppInfo> getAllAppsInfo();
	
	public int addApp(String softwareName,String APKName,String supportROM,String interfaceLanguage,
		 	 			Integer softwareSize,Integer downloads,String appInfo,String logoLocPath,
		 	 			String logoPicPath,String fileLocPath,String filePath,Integer flatformId,
		 	 			Integer categoryLevel1,Integer categoryLevel2,String appSummary,Date updateDate);
	
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
	
	public List<AppInfo> getAllAppInfo();
	
	public AppInfo getAppInfoResultMapById(Integer id);
	
	public List<AppInfo> getAppInfoListByCategoryLevel(Integer categoryLevel1,Integer categoryLevel2);
	
	public int updateDownloads(Integer id);
}
