package com.partyapp;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication()
@OpenAPIDefinition(info = @Info(title = "WParty Server APP"))
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


}
