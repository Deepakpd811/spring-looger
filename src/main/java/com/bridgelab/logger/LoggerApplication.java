package com.bridgelab.logger;

import com.bridgelab.logger.component.DemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LoggerApplication {

	public static void main(String[] args) {

		System.out.println("Hello spring boot");

		ApplicationContext context = SpringApplication.run(LoggerApplication.class, args);

		System.out.println(context.getBean(DemoBean.class));

	}

}
