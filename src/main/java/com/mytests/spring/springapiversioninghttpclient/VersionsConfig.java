package com.mytests.spring.springapiversioninghttpclient;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.ApiVersionInserter;
import org.springframework.web.servlet.config.annotation.ApiVersionConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class VersionsConfig implements WebMvcConfigurer {

	@Override
	public void configureApiVersioning(ApiVersionConfigurer configurer) {
		configurer.setVersionRequired(false);
		configurer.useQueryParam("version_query_param");
		//configurer.useRequestHeader("API-Version");
	}


}