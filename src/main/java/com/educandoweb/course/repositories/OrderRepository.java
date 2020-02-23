package com.educandoweb.course.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;

public interface OrderRepository extends JpaRepository<User, Long>{

	void saveAll(List<Order> asList);

}
