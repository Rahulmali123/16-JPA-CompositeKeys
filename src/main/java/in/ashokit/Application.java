package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.AccountService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);

		AccountService service = ctx.getBean(AccountService.class);

		service.saveAccData(); // 👉 INSERT होईल
		service.getDataUsingPk(); // 👉 FETCH होईल
	}

}
