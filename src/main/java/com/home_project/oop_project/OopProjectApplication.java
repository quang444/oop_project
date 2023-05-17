package com.home_project.oop_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.home_project.oop_project.entity.Order;
import com.home_project.oop_project.repository.OrderRepository;

@SpringBootApplication
public class OopProjectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(OopProjectApplication.class, args);
		System.out.println("Every thing is worked!");
	}

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		 Order student1 = new Order("Ramesh", "Fadatare", "ramesh@gmail.com","3","5");
		 orderRepository.save(student1);
		 
		  Order student2 = new Order("Sanjay", "Jadhav", "sanjay@gmail.com","4","ok");
		  orderRepository.save(student2);
		  
		  Order student3 = new Order("tony", "stark", "tony@gmail.com","oke","5");
		  orderRepository.save(student3);
		 
		
	}
}
