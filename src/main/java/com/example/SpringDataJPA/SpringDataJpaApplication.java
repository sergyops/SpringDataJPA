package com.example.SpringDataJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

		CarRepository repository = context.getBean(CarRepository.class);

		System.out.println("find");
		System.out.println("Number of cars: " + repository.count());

		//Create and save
		Car toyota = new Car(null, "Toyota", "Prius", 2010);
		repository.save(toyota);

		System.out.println("Number of cars: " + repository.count());
		//recover data
		System.out.println(repository.findAll());
	}

}
