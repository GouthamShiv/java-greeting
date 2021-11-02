package in.net.goutham.greeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingApplication { 
//	extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(GreetingApplication.class, args);
	}

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(GreetingApplication.class);
//	}

}
