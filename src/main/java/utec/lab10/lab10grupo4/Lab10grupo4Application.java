package utec.lab10.lab10grupo4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"controller", "business"})
@EntityScan("data")
@EnableJpaRepositories("data.repositories")
public class Lab10grupo4Application {
	private static final Logger log = LoggerFactory.getLogger(Lab10grupo4Application.class);
    public static void main(String[] args) {
        SpringApplication.run(Lab10grupo4Application.class, args);
    }

}
