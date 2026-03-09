package com.webservice.projectweb.repositories;

import com.webservice.projectweb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
