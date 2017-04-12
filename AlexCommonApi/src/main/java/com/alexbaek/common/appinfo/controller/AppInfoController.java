/***************************************************************************************************
*   @클래스명  : AppInfoController.java
*   @패키지명  : com.alexbaek.common.appinfo.controller
*   @작성자	: 백우영
*   @작성일	: 2017. 3. 20. 오전 11:46:02
************************** @수정이력 ****************************************************************
*  수정일    수정자   수정내용
*     
***************************************************************************************************/
package com.alexbaek.common.appinfo.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alexbaek.common.appinfo.service.AppInfoService;
import com.alexbaek.common.appinfo.vo.AppInfoVO;
import com.alexbaek.common.appinfo.vo.NoticeInfoVO;
import com.alexbaek.common.appinfo.vo.ResponseAppInfoVO;

/**
 * The Class AppInfoController.java.
 * 설명 :
 *
 * @author 백우영
 * @version 1.0
 */
@RestController
@RequestMapping("/appinfo")
public class AppInfoController {
	
	// TODO. 공지사항 개발
	// TODO. 
	
	private static final Logger logger = LoggerFactory.getLogger(AppInfoController.class);
		
	@Autowired
	private AppInfoService mAppInfoService;
	
	 /**
	  * Comment : 앱에 대한 정보를 리턴. 
	  * Date	: 2017. 2. 22.
	  * @return void
	  */
	 @RequestMapping(value = "/getAppInfo", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseAppInfoVO getAppInfo(HttpServletRequest req, @RequestBody AppInfoVO reqAppInfo) {
	 	
	 	logger.info("==================== {} ====================", "AppInfoController :: getAppInfo");
	 	
	 	ResponseAppInfoVO resultVO;
		try {
			resultVO = mAppInfoService.getAppInfo(reqAppInfo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 	
	 	return null;
	 }
	 
	 /**
	  * Comment : 공지사항 정보를 리턴.
	  * Date	: 2017. 4. 7.
	  * @return NoticeInfoVO
	  * @return
	  */
	 @RequestMapping(value = "/getNoticeInfo", method = RequestMethod.POST)
	 public NoticeInfoVO getNoticeInfo() {
		 
		 logger.info("==================== {} ====================", "AppInfoController :: getNoticeInfo");
		 
		 
		 
		 return null;
	 }
}
