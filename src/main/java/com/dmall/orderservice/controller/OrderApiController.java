package com.dmall.orderservice.controller;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmall.orderservice.repository.OrderRepository;


@RestController
@RequestMapping("/api/order")
public class OrderApiController {

	@Autowired
	private OrderRepository orderRepository ;
	
	//healthcheck
	@Value("${server.env}")
	private String env;
	
	@GetMapping("/env")
	public ResponseEntity<?> getEnv() {
		return ResponseEntity.ok(env);
	}
	//////////////////////////////////////////////
}
