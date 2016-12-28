package api.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages={"api.controller","api.service","api.repository","api.config"})
public class SpringBootApp extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return super.configure(builder);
		return builder.sources(SpringBootApp.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp.class, args);
	}
	
}
