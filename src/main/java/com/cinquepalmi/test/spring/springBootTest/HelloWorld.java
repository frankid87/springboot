package com.cinquepalmi.test.spring.springBootTest;

import java.util.Locale;

import org.apache.tomcat.util.descriptor.web.ContextLocalEjb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@Autowired
	public MessageSource messageSource;

	// SesselionLocaleResolver internalization
//	@GetMapping(path="/helloworld")
//	public String getHelloWorld(@RequestHeader(name="Accept-Language", required=false) Locale locale) {
//		return messageSource.getMessage("good.morning.message", null, locale);
//	}
	
	// AcceptHeaderLocaleResolver internalization
	@GetMapping(path="/helloworld")
	public String getHelloWorld() {
		return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
	}
	
}