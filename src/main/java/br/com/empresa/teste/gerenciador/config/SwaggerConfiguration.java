package br.com.empresa.teste.gerenciador.config;

import java.util.Collections;

import javax.swing.plaf.basic.BasicToolBarUI.DockingListener;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SuppressWarnings("unused")
@Configuration
public class SwaggerConfiguration {
	
	@Bean
	public Docket api() {		
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("br.com.empresa.teste.gerenciador.controller"))
				.paths(PathSelectors.ant("/**"))
				.build()
				.apiInfo(apiInfo());		
	}
	
	private ApiInfo apiInfo() {
	    return new ApiInfo(
	      "Gerenciadro de Pessoas REST API", 
	      "API responsável pelo cadastro de pessoas", 
	      "Teste empresa", 
	      "Teste Empresa", 
	      new Contact("Richard Souza", "www.example.com", "myeaddress@company.com"), 
	      "License of API", "API license URL", Collections.emptyList());
	}
}