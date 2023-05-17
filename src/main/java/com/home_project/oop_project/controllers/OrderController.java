package com.home_project.oop_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.home_project.oop_project.entity.Order;
import com.home_project.oop_project.service.OrderService;

@Controller
@RequestMapping("/admin/order")
public class OrderController {
    private OrderService orderService;

	public OrderController(OrderService orderService) {
		super();
		this.orderService = orderService;
	}
	
	// handler method to handle list orders and return mode and view
	@GetMapping("/")
	public String listOrders(Model model) {
		model.addAttribute("orders", orderService.getAllOrders());
		return "admin/adminOrder";
	}
	
	@GetMapping("/new")
	public String createOrderForm(Model model) {
		
		// create order object to hold order form data
		Order order = new Order();
		model.addAttribute("order", order);
		return "admin/addOrder";
		
	}
	
	@PostMapping("/add")
	public String saveOrder(@ModelAttribute("order") Order order) {
		orderService.saveOrder(order);
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String editOrderForm(@PathVariable Long id, Model model) {
		model.addAttribute("order", orderService.getOrderById(id));
		return "editOrder";
	}

	@PostMapping("/{id}")
	public String updateOrder(@PathVariable Long id,
			@ModelAttribute("order") Order order,
			Model model) {
		
		// get order from database by id
		Order existingOrder = orderService.getOrderById(id);
		existingOrder.setId(id);
		existingOrder.setStartPoint(order.getStartPoint());
		existingOrder.setEndPoint(order.getEndPoint());
		existingOrder.setValue(order.getValue());
		existingOrder.setShipperID(order.getShipperID());
		existingOrder.setStatus(order.getStatus());
		
		// save updated order object
		orderService.updateOrder(existingOrder);
		return "redirect:/orders";		
	}
	
	// handler method to handle delete order request
	
	@GetMapping("/{id}")
	public String deleteOrder(@PathVariable Long id) {
		orderService.deleteOrderById(id);
		return "redirect:/orders";
	}
}
