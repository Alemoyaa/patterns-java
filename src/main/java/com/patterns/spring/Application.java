package com.patterns.spring;

import com.patterns.spring.realworld.singleton.LoadBalancer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		testRealWorld();
	}

	public static void testRealWorld() {

		LoadBalancer balancer1 = LoadBalancer.getInstance();
		LoadBalancer balancer2 = LoadBalancer.getInstance();

		if (balancer1 == balancer2) {
			System.out.println("balancer1 and balancer2 are the same instance");
		}

		for (int i = 0; i < 15; i++) {
			String server = balancer1.getServer();
			System.out.println("Request is sent to: " + server);
		}

	}
}
