package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Associate;

@Controller
public class controller {
	
	@Autowired
	Associate associate;
	
	
	@RequestMapping("/")
	public String homepage() {
		return "index";
	}		
		
	@RequestMapping("register")
		public String registerForm(Model model) {
		model.addAttribute("ass", associate);
		return "registerpage";
		
	}

	@RequestMapping("submitform")
	public String submitForm(@ModelAttribute("ass1") Associate ass1) {
		
		System.out.println(ass1);
		return "display";
		
	}
}
