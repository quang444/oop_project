package com.home_project.oop_project.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.home_project.oop_project.entity.Order;

public interface OrderService {
    List<Order> getAllOrders();
	
	Order saveOrder(Order order);
	
	Order getOrderById(Long id);
	
	Order updateOrder(Order order);
	
	void deleteOrderById(Long id);

}
