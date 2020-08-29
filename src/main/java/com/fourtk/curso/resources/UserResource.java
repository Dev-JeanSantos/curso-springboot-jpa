package com.fourtk.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fourtk.curso.entities.User;

@RestController //Classe de recursos
@RequestMapping(value = "/users") //nome do recurso
public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1L, "Jean Santos", "jeancbsan@gmail.com",
				"999999", "amor12");
		return ResponseEntity.ok().body(u);
		
	}

}
