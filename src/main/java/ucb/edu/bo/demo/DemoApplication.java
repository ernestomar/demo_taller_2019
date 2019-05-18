package ucb.edu.bo.demo;

import ucb.edu.bo.demo.dao.*;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class DemoApplication {

	@Bean
	public AlumnoDao alumnoDao() {
		return new AlumnoDaoBDImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
