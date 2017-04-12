/***************************************************************************************************
*   
*   @클래스명  : ApiDocUtil.java
*   @패키지명  : com.alexbaek.common.util.doc
*   @작성자	: 백우영
*   @작성일	: 2017. 4. 10. 오후 6:16:48
************************** @수정이력 ****************************************************************
*  수정일    수정자   수정내용
*     
***************************************************************************************************/
package com.alexbaek.common.util.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * The Class ApiDocUtil.java.
 * 설명 : Swagger를 이용한 API 문서.
 *
 * @author 백우영
 * @version 1.0
 */
@Configuration
@EnableSwagger2
public class ApiDocUtil {
	@Bean 
	public Docket api() { 
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any()) // 현재 RequestMapping으로 할당된 모든 URL 리스트를 추출
				.paths(PathSelectors.ant("/appinfo/**")) // 그중 /api/** 인 URL들만 필터링
				.build();
	}
}

