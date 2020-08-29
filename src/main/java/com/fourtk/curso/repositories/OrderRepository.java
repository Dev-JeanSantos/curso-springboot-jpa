package com.fourtk.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fourtk.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
