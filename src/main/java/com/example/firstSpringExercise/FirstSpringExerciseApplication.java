package com.example.firstSpringExercise;

import com.example.firstSpringExercise.model.Car;
import com.example.firstSpringExercise.model.CarOwner;
import com.example.firstSpringExercise.model.Engine;
import com.example.firstSpringExercise.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
public class FirstSpringExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringExerciseApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CarRepository repository){

		return args ->{
			CarOwner owner = new CarOwner("Stoyan", LocalDate.now());
			Engine engine = new Engine("5678",1.9,90);
			Car car = new Car(engine,owner,"VW","Golf",2003,"M2040BT");
			Engine engine4 = new Engine("5555",1.9,90);
			Car car4 = new Car(engine4,owner,"VW","Bora",2003,"M2040BT");
			CarOwner owner1 = new CarOwner("Georgi", LocalDate.now());
			Engine engine1 = new Engine("2222",2.8,450);
			Car car1 = new Car(engine1,owner1,"Porsche","GT2RS",2018,"B9111MN");

			repository.save(car1);
			repository.saveAll(Arrays.asList(car,car4));

		};
	}
}
