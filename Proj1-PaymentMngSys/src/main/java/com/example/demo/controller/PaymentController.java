package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.feign.Ipayment;

@RestController
public class PaymentController {
	@Autowired
	Ipayment pIpayment;
	
	@GetMapping("/payment")
	public String paymentService() {
		return pIpayment.myOrder() +" pay the money ...";
	}

}
