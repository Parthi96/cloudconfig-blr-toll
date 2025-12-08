package com.parthi.configserver_git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableCongigServer
@SpringBootApplication
public class ConfigserverGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigserverGitApplication.class, args);
	}

}
