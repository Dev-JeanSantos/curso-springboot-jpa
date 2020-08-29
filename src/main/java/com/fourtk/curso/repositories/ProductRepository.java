package com.fourtk.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fourtk.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
