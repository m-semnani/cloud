package nl.micro.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceHavij {
	public static void main(String[] args) {
		SpringApplication.run(ServiceHavij.class, args);
	}
}
