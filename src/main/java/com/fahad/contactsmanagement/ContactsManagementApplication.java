package com.fahad.contactsmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.fahad.entityclasses")
@EnableJpaRepositories(basePackages = "com.fahad.repositories")
@ComponentScan(basePackages = "com.fahad.*")
public class ContactsManagementApplication {
	public static void main(String[] args) {
		SpringApplication.run(ContactsManagementApplication.class, args);
	}
}

