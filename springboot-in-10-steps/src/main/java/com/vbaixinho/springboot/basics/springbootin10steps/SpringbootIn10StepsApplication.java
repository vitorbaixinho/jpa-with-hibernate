package com.vbaixinho.springboot.basics.springbootin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//Indicates
//1-spring context
//2-automatic configuration
//3-automatic scan thought the package
@SpringBootApplication
public class SpringbootIn10StepsApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringbootIn10StepsApplication.class, args);
		
//		for (String bean : applicationContext.getBeanDefinitionNames()) {
//			System.out.println(bean);
//		}
	}

}
