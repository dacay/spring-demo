package tr.com.workintech.java.spring1.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context) {

		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {


				System.out.println("Let's inspect the beans provided by Spring Boot:");

				String[] beanNames = context.getBeanDefinitionNames();

				Arrays.sort(beanNames);

				for (String beanName : beanNames) {
					System.out.println(beanName);
				}
			}
		};
	}
}
