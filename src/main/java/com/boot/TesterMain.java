package com.boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.boot")
public class TesterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SpringApplication.run(TesterMain.class, args);

	}

}
