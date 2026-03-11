package com.webservice.projectweb.repositories;

import com.webservice.projectweb.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {


}
