package com.CI.java_gradle_project.java_gradle_project;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaGradleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaGradleProjectApplication.class, args);
		System.out.println("Hello world ");
	}

}
