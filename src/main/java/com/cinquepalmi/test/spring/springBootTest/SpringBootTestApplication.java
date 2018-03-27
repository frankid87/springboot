package com.cinquepalmi.test.spring.springBootTest;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

@SpringBootApplication
public class SpringBootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestApplication.class, args);
	}
	
	// AcceptHeaderLocaleResolver internalization
	public LocaleResolver localeResolver() {
		AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
		localeResolver.setDefaultLocale(Locale.ITALY);
		return localeResolver;		
	}
	
	
	// SessionLocaleResolver internalization
//	@Bean
//	public LocaleResolver localeResolver() {
//		SessionLocaleResolver localResolver = new SessionLocaleResolver();
//		localResolver.setDefaultLocale(Locale.ITALY);
//		return localResolver;
//	}
//	
//	@Bean 
//	public ResourceBundleViewResolver resourceBundleViewResolver() {
//		ResourceBundleViewResolver resourceBundleViewResolver = new ResourceBundleViewResolver();
//		resourceBundleViewResolver.setBasename("messages");
//		return resourceBundleViewResolver;
//	}
}
