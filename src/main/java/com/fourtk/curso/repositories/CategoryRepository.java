package com.fourtk.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fourtk.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
