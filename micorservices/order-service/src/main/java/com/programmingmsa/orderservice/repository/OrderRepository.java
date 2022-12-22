package com.programmingmsa.orderservice.repository;

import com.programmingmsa.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}