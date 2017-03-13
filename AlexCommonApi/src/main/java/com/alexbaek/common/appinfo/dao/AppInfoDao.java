/***************************************************************************************************
*   @클래스명  : AppInfoDao.java
*   @패키지명  : com.alexbaek.common.appinfo.dao
*   @작성자	: 백우영
*   @작성일	: 2017. 2. 22. 오후 6:10:11
************************** @수정이력 ****************************************************************
*  수정일    수정자   수정내용
*     
***************************************************************************************************/
package com.alexbaek.common.appinfo.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alexbaek.common.appinfo.vo.AppInfoVO;

/**
 * The Class AppInfoDao.java.
 * 설명 :
 *
 * @author 백우영
 * @version 1.0
 */
@Component
public class AppInfoDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public AppInfoVO selectAppInfo(AppInfoVO appInfo) {
		return this.sqlSession.selectOne("selectAppInfo", appInfo);
	}
}
