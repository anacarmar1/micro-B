package inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableFeignClients("com.cuentasmdb.feignclients")
@EnableMongoRepositories("com.cuentasmdb.repository")
@ComponentScan("com.cuentasmdb.*")
public class MicroservicioCuentasmdb2Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioCuentasmdb2Application.class, args);
	}

}
