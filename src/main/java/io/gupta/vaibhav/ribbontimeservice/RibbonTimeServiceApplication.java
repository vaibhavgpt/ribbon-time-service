package io.gupta.vaibhav.ribbontimeservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class RibbonTimeServiceApplication {
	@Value("${server.port}")
	private String port;

	public static void main(String[] args) {
		SpringApplication.run(RibbonTimeServiceApplication.class, args);
	}

	@GetMapping
	public String getTime(){
		return "Current DateTime is " + LocalDateTime.now()
				+" (answered ny service running on "+port+")";
	}
}
