package jp.shibadog.sample.prometheusdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PrometheusDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrometheusDemoApplication.class, args);
	}

	@RequestMapping("")
	public String get() {
		return "Hello!";
	}
}

