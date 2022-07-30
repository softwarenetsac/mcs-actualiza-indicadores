package pe.gob.minjus.mcs.indicadores.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import springfox.documentation.spring.web.plugins.Docket;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

		@Bean
	    public Docket defApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                   .select()                 
	                   .apis(RequestHandlerSelectors.basePackage("pe.gob.minjus.mcs.indicadores.controller"))
	                   .paths(regex("/actualiza.*"))
	                   .build()
	                   .apiInfo(metaData());
	    }
	    
	    private ApiInfo metaData() {
	    	
	   	 return new ApiInfoBuilder()
	        		.title(":: MINJUS ::")
	                .description("Componente para la actualización de datos para el tablero de Indicadores")
	                .termsOfServiceUrl("Terminos del servicio")
	                .version("1.0")
	                .contact(new Contact("MINJUS", "https://www.gob.pe/minjus", "correo@minjus.gob.pe"))
	                .license("Apache License Version 2.0")
	                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
	                .build();    	

	   }    	
	
}
