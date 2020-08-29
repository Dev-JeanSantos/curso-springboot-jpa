package com.fourtk.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fourtk.curso.entities.User;
import com.fourtk.curso.services.UserService;

//classe responsavel pelo CRUD (Acesso direto ao BD)

@RestController //Classe de recursos do controle do banco
@RequestMapping(value = "/users") //nome do recurso
public class UserResource {
	
	@Autowired
	private UserService userService; //Injetando uma instancia do userService
	
	@GetMapping //Usado para definir que é uma chamada GET
	public ResponseEntity<List<User>> findAll(){//metodo que busca todos os usuarios por id
		
		List<User> list = userService.findAll();
		
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value = "/{id}")//declara que o metodo vai passar um id
	public ResponseEntity<User> findById(@PathVariable Long id){ //@Pathvariable define a passagem dessa variavel id (VITAL)
		
		User obj = userService.findById(id); //recebe o metodo findbyId do UserService
		return ResponseEntity.ok().body(obj);
	}

}
