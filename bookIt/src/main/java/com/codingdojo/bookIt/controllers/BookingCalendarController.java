package com.codingdojo.bookIt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.bookIt.services.BookingCalendarService;


@Controller
public class BookingCalendarController {
	@Autowired
	private BookingCalendarService cService;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
}
