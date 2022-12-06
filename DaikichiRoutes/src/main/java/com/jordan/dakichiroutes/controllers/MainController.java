package com.jordan.dakichiroutes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	
	@GetMapping("/daikichi")
	public String index() {
		return "travel.jsp";
	}
	
	@RequestMapping("/daikichi/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}

	@RequestMapping("/daikichi/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}

	@GetMapping("/daikichi/travel/{city}")
	public String travelTo(@PathVariable("city") String city, Model model) {
	model.addAttribute("city", city);
		return "travel.jsp";
	}

	@GetMapping("/daikichi/lotto/{number}")
	public String travelTo(@PathVariable("number") int number, Model model) {
		
		model.addAttribute("number", number);
		return "lotto.jsp";
	}

}
