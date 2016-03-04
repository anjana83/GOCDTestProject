package com.gocd.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


/**
 * Spring boot main class
 * 
 * @author 
 * @version 1.0 Build Oct 15, 2015
 */

//@ComponentScan(basePackages = { "com.comcast.activation" })
@SpringBootApplication
@Component
@EnableAutoConfiguration

public class GoCdTestApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(GoCdTestApplication.class, args);
	}
}
