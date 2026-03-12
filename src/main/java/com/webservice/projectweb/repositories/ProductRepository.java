package com.webservice.projectweb.repositories;

import com.webservice.projectweb.entities.Category;
import com.webservice.projectweb.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {


}
