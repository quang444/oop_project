package com.home_project.oop_project.controller;

import java.sql.*;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    @GetMapping(value = {"/","/home"})
	public String home(Model model) {
		return "home";
	}
}
