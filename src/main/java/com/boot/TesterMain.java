package com.boot;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.boot")
public class TesterMain {
	private static Logger logger = LogManager.getLogger(TesterMain.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.info("Initializing Spring boot");
		 SpringApplication.run(TesterMain.class, args);
		 logger.info("Spring boot initialized");

}
}
