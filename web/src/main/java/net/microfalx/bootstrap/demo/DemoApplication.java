package net.microfalx.bootstrap.demo;

import net.microfalx.bootstrap.configuration.annotation.EnableConfigurationMapping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan({"net.microfalx.bootstrap"})
@EnableJpaRepositories({"net.microfalx.bootstrap"})
@EntityScan({"net.microfalx.bootstrap"})
@EnableConfigurationMapping({"net.microfalx.bootstrap"})
@EnableTransactionManagement
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
