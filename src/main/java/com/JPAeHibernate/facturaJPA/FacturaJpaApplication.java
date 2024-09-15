package com.JPAeHibernate.facturaJPA;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacturaJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacturaJpaApplication.class, args);
		System.out.println("hello world");
	}

}
