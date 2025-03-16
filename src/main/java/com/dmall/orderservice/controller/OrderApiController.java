package com.dmall.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmall.orderservice.repository.OrderRepository;

@RestController
@RequestMapping("/api/order")
public class OrderApiController {

	@Autowired
	private OrderRepository orderRepository;
	
	
}
