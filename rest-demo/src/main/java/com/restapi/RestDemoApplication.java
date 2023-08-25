package com.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collection;
import java.util.Collections;

/*
	http://localhost:8081/swagger-ui/#/
*/

@SpringBootApplication
public class RestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/cloudvendor/vendors/*"))
				.apis(RequestHandlerSelectors.basePackage("com.restapi"))
				.build()
				.apiInfo(apiCustomData());
	}

	private ApiInfo apiCustomData(){
		return new ApiInfo(
				"Cloud Vendor Api App",
				"Cloud vendor docs",
				"1.0",
				"Cloud vendor service terms",
				new Contact("Shubham","https://github.com/","shubhamdiddi@gmail.com"),
				"Cloud vendor License",
				"https://github.com/\"",
				Collections.emptyList()
		);
	}

	/*
		  this.title = title;
		this.description = description;
		this.version = version;
		this.termsOfServiceUrl = termsOfServiceUrl;
		this.contact = contact;
		this.license = license;
		this.licenseUrl = licenseUrl;
		this.vendorExtensions = new ArrayList<>(vendorExtensions);
	*/
}
