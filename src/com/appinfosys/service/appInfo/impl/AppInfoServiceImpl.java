package com.appinfosys.service.appInfo.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appinfosys.dao.appInfo.AppInfoMapper;
import com.appinfosys.pojo.AppInfo;
import com.appinfosys.service.appInfo.AppInfoService;

@Service
public class AppInfoServiceImpl implements AppInfoService{
	@Resource
	private AppInfoMapper appInfoMapper;

	@Override
	public List<AppInfo> getAppInfoList(String querySoftwareName,
			Integer queryStatus, Integer queryCategoryLevel1,
			Integer queryCategoryLevel2, Integer queryCategoryLevel3,
			Integer queryFlatformId, Integer devId){
		return appInfoMapper.getAppInfoList(querySoftwareName, queryStatus, queryCategoryLevel1, queryCategoryLevel2, queryCategoryLevel3, queryFlatformId, devId);

	}

	@Override
	public List<AppInfo> getAllAppsInfo() {
		return appInfoMapper.getAllAppsInfo();
	}

	@Override
	public int addApp(String softwareName, String APKName, String supportROM,
			String interfaceLanguage, Integer softwareSize, Integer downloads,
			String appInfo,String logoLocPath,String logoPicPath,String fileLocPath,
			String filePath,Integer flatformId,Integer categoryLevel1,Integer categoryLevel2,String appSummary,Date updateDate) {
		return appInfoMapper.addApp(softwareName, APKName, supportROM, interfaceLanguage, softwareSize, 
									downloads, appInfo, logoLocPath,logoPicPath,fileLocPath,filePath,
									flatformId,categoryLevel1,categoryLevel2,appSummary,updateDate);
	}

	@Override
	public int deleteApp(Integer id) {
		return appInfoMapper.deleteApp(id);
	}

	@Override
	public AppInfo getAppInfoById(Integer id) {
		return appInfoMapper.getAppInfoById(id);
	}

	@Override
	public List<AppInfo> getAppInfosBySoftwareName(String softwareName) {
		return appInfoMapper.getAppInfosBySoftwareName(softwareName);
	}

	@Override
	public int modifyApp(String softwareName, String APKName, Integer statusId,
			String supportROM, String interfaceLanguage, Integer softwareSize,
			Integer downloads, String appInfo,Integer flatformId, Integer id) {
		return appInfoMapper.modifyAppInfoById(softwareName, APKName, statusId, supportROM, interfaceLanguage, softwareSize, downloads, appInfo,flatformId, id);
	}

	@Override
	public List<AppInfo> getAppInfoByStatusId(Integer statusId) {
		return appInfoMapper.getAppInfoByStatusId(statusId);
	}

	@Override
	public int verifyAppInfoById(Integer statusId) {
		return appInfoMapper.verifyAppInfoById(statusId);
	}

	@Override
	public int shangJiaAppById(Integer id) {
		return appInfoMapper.shangJiaAppById(id);
	}

	@Override
	public int xiaJiaAppById(Integer id) {
		return appInfoMapper.xiaJiaAppById(id);
	}

	@Override
	public AppInfo getAppInfoBySoftWareName(String softwareName) {
		return appInfoMapper.getAppInfoBySoftWareName(softwareName);
	}

	@Override
	public List<AppInfo> getAppInfoOrderByDownloads() {
		return appInfoMapper.getAppInfoOrderByDownloads();
	}

	@Override
	public List<AppInfo> getAppInfoByStatusIdIsFour() {
		return appInfoMapper.getAppInfoByStatusIdIsFour();
	}

	@Override
	public List<AppInfo> getAllAppInfo() {
		return appInfoMapper.getAllAppInfo();
	}

	@Override
	public AppInfo getAppInfoResultMapById(Integer id) {
		return appInfoMapper.getAppInfoResultMapById(id);
	}

	@Override
	public List<AppInfo> getAppInfoListByCategoryLevel(Integer categoryLevel1,
			Integer categoryLevel2) {
		List<AppInfo> appInfoList=null;
		appInfoList=appInfoMapper.getAppInfoListByCategoryLevel(categoryLevel1, categoryLevel2);
		return appInfoList;
	}

	@Override
	public int updateDownloads(Integer id) {
		return appInfoMapper.updateDownloads(id);
	}
}
