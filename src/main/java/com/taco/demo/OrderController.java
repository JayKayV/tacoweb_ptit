package com.taco.demo;

import org.springframework.beans.factory.annotation.Autowired;
//import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import lombok.extern.slf4j.Slf4j;
import com.taco.demo.Order;

//@Slf4j
@RestController
@RequestMapping("/orders")
public class OrderController {
	private final OrderRepository orderRepo;
	
	@Autowired
	public OrderController(OrderRepository orderRepo) {
		this.orderRepo = orderRepo;
	}
	
	@GetMapping(path="/current", produces="text/json")
	public Iterable<Taco> orderForm() {
		return null;
	}
	
	@PostMapping
	public void processOrder(Order order) {
		orderRepo.save(order);
	}
}
