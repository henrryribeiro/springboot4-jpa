package com.webservice.projectweb.repositories;

import com.webservice.projectweb.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
