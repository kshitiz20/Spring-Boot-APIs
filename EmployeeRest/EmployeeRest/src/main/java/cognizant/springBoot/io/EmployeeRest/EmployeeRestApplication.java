package cognizant.springBoot.io.EmployeeRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"cognizant.springBoot.io.Employee"})
public class EmployeeRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRestApplication.class, args);
	}
}
