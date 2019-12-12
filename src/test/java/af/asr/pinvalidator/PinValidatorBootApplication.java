package af.asr.pinvalidator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "af.asr.*")
public class PinValidatorBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(PinValidatorBootApplication.class, args);
	}
}
