package com.ririn.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ririn.order.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
