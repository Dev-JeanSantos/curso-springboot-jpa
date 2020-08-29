package com.fourtk.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fourtk.curso.entities.Category;
import com.fourtk.curso.services.CategoryService;

//classe responsavel pelo CRUD (Acesso direto ao BD)

@RestController //Classe de recursos do controle do banco
@RequestMapping(value = "/categories") //nome do recurso
public class CategoryResource {
	
	@Autowired
	private CategoryService categoryService; //Injetando uma instancia do userService
	
	@GetMapping //Usado para definir que é uma chamada GET
	public ResponseEntity<List<Category>> findAll(){//metodo que busca todos os usuarios por id
		
		List<Category> list = categoryService.findAll();
		
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value = "/{id}")//declara que o metodo vai passar um id
	public ResponseEntity<Category> findById(@PathVariable Long id){ //@Pathvariable define a passagem dessa variavel id (VITAL)
		
		Category obj = categoryService.findById(id); //recebe o metodo findbyId do CategoryService
		return ResponseEntity.ok().body(obj);
	}

}
