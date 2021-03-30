package realsnack.springboot.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import realsnack.springboot.restapi.models.Hello;

@SpringBootApplication
@RestController
public class RestapiApplication {

	@RequestMapping("/")
	public Hello home() {
		return new Hello("Hello there stranger");
	}

	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}

}
