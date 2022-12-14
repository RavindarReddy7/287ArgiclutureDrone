package com.drone.agriDrone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
public class AgriDroneApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgriDroneApplication.class, args);
	}

	/*
	 * @Bean(name="entityManagerFactory") public LocalSessionFactoryBean
	 * sessionFactory() { LocalSessionFactoryBean sessionFactory = new
	 * LocalSessionFactoryBean();
	 * 
	 * return sessionFactory; }
	 */
}
