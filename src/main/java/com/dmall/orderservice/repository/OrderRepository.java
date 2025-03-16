package com.dmall.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmall.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
