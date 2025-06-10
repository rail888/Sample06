package pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Sample06Application {
	@GetMapping("/")
	public String hello(){
		return "06/10: hello 시저 v01";
	}

	public static void main(String[] args) {
		SpringApplication.run(Sample06Application.class, args);
	}

}
