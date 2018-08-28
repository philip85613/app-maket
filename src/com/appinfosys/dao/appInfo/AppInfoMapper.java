package com.appinfosys.dao.appInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.appinfosys.pojo.AppInfo;

public interface AppInfoMapper {

	public List<AppInfo> getAppInfoList(@Param(value="softwareName")String querySoftwareName,
										@Param(value="status")Integer queryStatus,
										@Param(value="categoryLevel1")Integer queryCategoryLevel1,
										@Param(value="categoryLevel2")Integer queryCategoryLevel2,
										@Param(value="categoryLevel3")Integer queryCategoryLevel3,
										@Param(value="flatformId")Integer queryFlatformId,
										@Param(value="devId")Integer devId);
	
	public List<AppInfo> getAllAppsInfo();
	
	public int addApp(@Param(value="softwareName")String softwareName,
				 	  @Param(value="APKName")String APKName,
				 	  @Param(value="supportROM")String supportROM,
				 	  @Param(value="interfaceLanguage")String interfaceLanguage,
				 	  @Param(value="softwareSize")Integer softwareSize,
				 	  @Param(value="downloads")Integer downloads,
				 	  @Param(value="appInfo")String appInfo,
				 	  @Param(value="logoLocPath")String logoLocPath,
				 	  @Param(value="logoPicPath")String logoPicPath,
				 	  @Param(value="fileLocPath")String fileLocPath,
				 	  @Param(value="filePath")String filePath,
				 	  @Param(value="flatformId")Integer flatformId,
				 	  @Param(value="categoryLevel1")Integer categoryLevel1,
				 	  @Param(value="categoryLevel2")Integer categoryLevel2);
	
	public int deleteApp(@Param(value="id")Integer id);
	
	public AppInfo getAppInfoById(@Param(value="id")Integer id);
	
	public List<AppInfo> getAppInfosBySoftwareName(@Param(value="softwareName")String softwareName);
	
	public int modifyAppInfoById(@Param(value="softwareName")String softwareName,
						 	  @Param(value="APKName")String APKName,
						 	  @Param(value="statusId")Integer statusId,
						 	  @Param(value="supportROM")String supportROM,
						 	  @Param(value="interfaceLanguage")String interfaceLanguage,
						 	  @Param(value="softwareSize")Integer softwareSize,
						 	  @Param(value="downloads")Integer downloads,
						 	  @Param(value="appInfo")String appInfo,
						 	  @Param(value="flatformId")Integer flatformId,
						 	  @Param(value="id")Integer id);
	
	public List<AppInfo> getAppInfoByStatusId(@Param(value="StatusId")Integer statusId);
	
	public int verifyAppInfoById(@Param(value="id")Integer id);
	
	public int shangJiaAppById(@Param(value="id")Integer id);
	
	public int xiaJiaAppById(@Param(value="id")Integer id);
	
	public AppInfo getAppInfoBySoftWareName(@Param(value="softwareName")String softwareName);
	
	public List<AppInfo> getAppInfoOrderByDownloads();
	
	/**
	 * 获得所有已上架的APP
	 * @return
	 */
	public List<AppInfo> getAppInfoByStatusIdIsFour();
	
	public List<AppInfo> getAllAppInfo();
	
	public AppInfo getAppInfoResultMapById(@Param(value="id")Integer id);
}
