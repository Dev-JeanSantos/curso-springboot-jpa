package com.fourtk.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fourtk.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
