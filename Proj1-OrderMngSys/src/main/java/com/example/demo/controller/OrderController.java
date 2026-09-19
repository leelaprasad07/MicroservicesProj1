package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {
	
	@GetMapping("/order")
	public String myOrder() {
		return "Order Is Ready ...";
	}

}
