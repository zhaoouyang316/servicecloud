package org.ow.servicecloud.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"org.ow.servicecloud.dao.user.mapper"})
@ComponentScan(basePackages = {
		"org.ow.servicecloud.api.**",
		"org.ow.servicecloud.service.**",
		"org.ow.servicecloud.dao.**",
		"org.ow.servicecloud.common.**"})
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
