/***************************************************************************************************
*   @클래스명  : AdminController.java
*   @패키지명  : com.alexbaek.common.admin.controller
*   @작성자	: 백우영
*   @작성일	: 2017. 3. 29. 오후 5:53:52
************************** @수정이력 ****************************************************************
*  수정일    수정자   수정내용
*     
***************************************************************************************************/
package com.alexbaek.common.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * The Class AdminController.java.
 * 설명 :
 *
 * @author 백우영
 * @version 1.0
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	 public String index() {
		
		logger.info("==================== {} ====================", "AppInfoController :: getAppInfo");
		 
		 return "admin/index";
	}
}
