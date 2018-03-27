package com.cinquepalmi.test.spring.springBootTest;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	public static final Contact DEFAULT_CONTACT = new Contact("Springboot application test", "http://localhost:8080", "frankid87@hotmail.it");
	
	public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Api description", "Api description", "1.0", "urn:tos",
			DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");

	public static final Set<String> DEFAULT_PRODUCES = new HashSet<String>();
	public static final Set<String> DEFAULT_CONSUMES = new HashSet<String>();
	static {
		DEFAULT_PRODUCES.add("application/xml");
		DEFAULT_PRODUCES.add("application/json");
		
		DEFAULT_CONSUMES.add("application/xml");
		DEFAULT_CONSUMES.add("application/json");
	}
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT_API_INFO).produces(DEFAULT_PRODUCES).consumes(DEFAULT_CONSUMES);
	}

}
