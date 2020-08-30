package com.fourtk.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fourtk.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
