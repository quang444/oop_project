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
		
		
//		 Order order1 = new Order("15 Đinh Tiên Hoàng", "Hà Nam",150,17,"ok");
//		 orderRepository.save(order1);
//
//		  Order order2 = new Order("Đà Nẵng", "Hải Phòng", 1200000,4,"ok");
//		  orderRepository.save(order2);
//
//		  Order order3 = new Order("Tân Sơn Nhất", "Đại La", 15000000,4,"not ok");
//		  orderRepository.save(order3);
		 
		
	}
}
