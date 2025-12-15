package com.parthi.configserver_git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigserverGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigserverGitApplication.class, args);
	}

}
