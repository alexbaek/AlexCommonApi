/***************************************************************************************************
*   @클래스명  : AppInfoServiceImpl.java
*   @패키지명  : com.alexbaek.common.appinfo.service
*   @작성자	: 백우영
*   @작성일	: 2017. 3. 20. 오전 11:49:46
************************** @수정이력 ****************************************************************
*  수정일    수정자   수정내용
*     
***************************************************************************************************/
package com.alexbaek.common.appinfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexbaek.common.appinfo.dao.AppInfoDaoMapper;
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
	private AppInfoDaoMapper appInfoDao;

	/**
	 * Comment :
	 * Date	: 2017. 3. 20.
	 * @param appInfo
	 * @return
	 */
	public AppInfoVO getAppInfo(AppInfoVO appInfo) {
		
		AppInfoVO result = null;
		try {
			result = appInfoDao.selectAppInfo(appInfo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	
}
