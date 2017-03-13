/***************************************************************************************************
*   @클래스명  : AppInfoServiceImpl.java
*   @패키지명  : com.alexbaek.common.appinfo.service
*   @작성자	: 백우영
*   @작성일	: 2017. 2. 22. 오후 6:10:58
************************** @수정이력 ****************************************************************
*  수정일    수정자   수정내용
*     
***************************************************************************************************/
package com.alexbaek.common.appinfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexbaek.common.appinfo.dao.AppInfoDao;
import com.alexbaek.common.appinfo.vo.AppInfoVO;

/**
 * The Class AppInfoServiceImpl.java.
 * 설명 :
 *
 * @author 백우영
 * @version 1.0
 */
@Service
public class AppInfoServiceImpl implements AppInfoService {
	
	@Autowired
	private AppInfoDao appInfoDao;

	/**
	 * Comment :
	 * Date	: 2017. 2. 23.
	 * @return
	 */
	@Override
	public AppInfoVO getAppInfo(AppInfoVO appInfo) {
		// TODO Auto-generated method stub
		
		AppInfoVO result = appInfoDao.selectAppInfo(appInfo);
		
		return result;
	}

}
