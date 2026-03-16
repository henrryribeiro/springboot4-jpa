package com.webservice.projectweb.repositories;

import com.webservice.projectweb.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
