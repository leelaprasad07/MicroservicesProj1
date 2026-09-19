package com.example.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Proj1-OrderMngSys")
public interface Ipayment {
	
	@GetMapping("/order")
	public String myOrder();
	 
	
}
