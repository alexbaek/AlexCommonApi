/***************************************************************************************************
*   @클래스명  : AppInfoService.java
*   @패키지명  : com.alexbaek.common.appinfo.service
*   @작성자	: 백우영
*   @작성일	: 2017. 3. 20. 오전 11:49:36
************************** @수정이력 ****************************************************************
*  수정일    수정자   수정내용
*     
***************************************************************************************************/
package com.alexbaek.common.appinfo.service;

import com.alexbaek.common.appinfo.vo.AppInfoVO;
import com.alexbaek.common.appinfo.vo.ResponseAppInfoVO;

/**
 * The Class AppInfoService.java.
 * 설명 :
 *
 * @author 백우영
 * @version 1.0
 */
public interface AppInfoService {
	
	/**
	 * Comment : 서비스 정보 조회.
	 * Date	: 2017. 4. 7.
	 * @return AppInfoVO
	 * @param appInfo
	 * @return
	 */
	public ResponseAppInfoVO getAppInfo(AppInfoVO appInfo) throws Exception;
	
}
