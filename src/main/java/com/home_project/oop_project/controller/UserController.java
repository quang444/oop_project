package com.home_project.oop_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    int adminlogcheck = 0;
	String usernameforclass = "";

	@RequestMapping(value = {"login"})
	public String returnIndex() {
		adminlogcheck =0;
		usernameforclass = "";
		return "userLogin";
	}

    @GetMapping("/register")
	public String registerUser()
	{
		return "register";
	} 

    

	@RequestMapping(value = "insert-user", method = RequestMethod.POST)
	public String newUseRegister()
	{
		try
		{
			
		}
		catch(Exception e)
		{
			System.out.println("Exception:"+e);
		}
		return "redirect:/";
	}
}
