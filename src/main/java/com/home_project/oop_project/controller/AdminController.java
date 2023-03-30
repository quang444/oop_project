package com.home_project.oop_project.controller;

import java.sql.*;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class AdminController {

	int adminlogcheck = 0;
	String usernameforclass = "";

	@RequestMapping(value = {"admin/login","admin/logout"})
	public String adminLogin() {
		adminlogcheck =0;
		usernameforclass = "";
		return "userLogin";
	}

	@RequestMapping(value = {"admin"})
	public String adminHome() {
		return "adminHome";
	}

	@RequestMapping(value = {"admin"})
	public String adminHome() {
		return "admin";
	}
    

}
