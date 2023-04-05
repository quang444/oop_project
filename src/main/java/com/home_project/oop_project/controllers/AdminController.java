package com.home_project.oop_project.controllers;

import java.sql.*;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@GetMapping("login")
	public String adminLogin(Model model) {
		
		return "admin/adminLogin";
	}
	@GetMapping("")
	public String adminHome(Model model) {
		// if(adminlogcheck!=0)
			return "admin/adminHome";
		// else
			// return "redirect:/admin/login";
	}
	// @GetMapping("admin-login")
	// public String adminLog(Model model) {
		
	// 	return "admin/adminLogin";
	// }
	// @RequestMapping(value = "admin-login", method = RequestMethod.POST)
	// public String adminLogin( @RequestParam("username") String username, @RequestParam("password") String pass,Model model) {
		
	// 	if(username.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("123")) {
	// 		adminlogcheck=1;
	// 		return "redirect:/admin";
	// 		}
	// 	else {
	// 		model.addAttribute("message", "Invalid Username or Password");
	// 		return "admin/adminLogin";
	// 	}
	// }

	@GetMapping("shipper")
	public String adminShipper(Model model) {
		
		return "admin/adminShipper";
	}

	@GetMapping("order")
	public String adminOrder(Model model) {
		
		return "admin/adminOrder";
	}

	@GetMapping("user")
	public String adminUser(Model model) {
		
		return "admin/adminUser";
	}

	@GetMapping("thong-ke")
	public String adminThongKe(Model model) {
		
		return "admin/adminThongKe";
	}

	@GetMapping("bao-cao")
	public String adminBaoCao(Model model) {
		
		return "admin/adminBaoCao";
	}
	
}
