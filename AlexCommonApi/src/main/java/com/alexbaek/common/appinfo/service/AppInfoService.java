/***************************************************************************************************
*   이 소스는 미디어로그 소유입니다.
*   이 소스를 무단으로 도용하면 법에 따라 처벌을 받을 수 있습니다.
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

/**
 * The Class AppInfoService.java.
 * 설명 :
 *
 * @author 백우영
 * @version 1.0
 */
public interface AppInfoService {
	public AppInfoVO getAppInfo(AppInfoVO appInfo);
}
