/***************************************************************************************************
*   이 소스는 미디어로그 소유입니다.
*   이 소스를 무단으로 도용하면 법에 따라 처벌을 받을 수 있습니다.
*   @클래스명  : AppInfoVO.java
*   @패키지명  : com.alexbaek.common.appinfo.vo
*   @작성자	: 백우영
*   @작성일	: 2017. 3. 20. 오전 11:51:01
************************** @수정이력 ****************************************************************
*  수정일    수정자   수정내용
*     
***************************************************************************************************/
package com.alexbaek.common.appinfo.vo;

import lombok.Data;

/**
 * The Class AppInfoVO.java.
 * 설명 :
 *
 * @author 백우영
 * @version 1.0
 */
@Data
public class AppInfoVO {
	private String serviceId;
	private String serviceType;
	private String serviceName;
	private String servicePackage;
	private String serviceRegDate;
}
