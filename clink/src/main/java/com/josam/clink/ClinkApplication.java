package com.josam.clink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class}) // 잠깐 DB 막아뒀습니다
@ComponentScan
@ServletComponentScan
public class ClinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinkApplication.class, args);
	}

}
