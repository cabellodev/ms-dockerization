package com.example.ms_dockerizacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class MsDockerizacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsDockerizacionApplication.class, args);


	}

}
