package hello.springmsaconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringmsaconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmsaconfigserverApplication.class, args);
	}

}
