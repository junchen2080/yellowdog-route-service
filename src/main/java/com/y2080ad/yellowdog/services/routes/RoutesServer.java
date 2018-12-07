package com.y2080ad.yellowdog.services.routes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

import com.y2080ad.yellowdog.services.routes.config.RoutesConfiguration;

@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
@Import(RoutesConfiguration.class)
public class RoutesServer {
	/**
	 * Run the application using Spring Boot and an embedded servlet engine.
	 * 
	 * @param args
	 *            Program arguments - ignored.
	 */
	public static void main(String[] args) {
		// Tell server to look for routes-server.properties or
		// routes-server.yml
		System.setProperty("spring.config.name", "routes-server");

		SpringApplication.run(RoutesServer.class, args);
	}
}
