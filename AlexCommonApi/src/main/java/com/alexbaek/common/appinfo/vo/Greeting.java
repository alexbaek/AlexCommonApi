/***************************************************************************************************
*   @클래스명  : Greeting.java
*   @패키지명  : com.alexbaek.common.appinfo.vo
*   @작성자	: 백우영
*   @작성일	: 2017. 2. 17. 오후 3:33:43
************************** @수정이력 ****************************************************************
*  수정일    수정자   수정내용
*     
***************************************************************************************************/
package com.alexbaek.common.appinfo.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class Greeting.java.
 * 설명 :
 *
 * @author 백우영
 * @version 1.0
 */
public class Greeting {
	@Getter
	@Setter
	private long id;
	@Getter
	@Setter
    private String content;

}
