package com.fourtk.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fourtk.curso.entities.Product;
import com.fourtk.curso.services.ProductService;

//classe responsavel pelo CRUD (Acesso direto ao BD)

@RestController //Classe de recursos do controle do banco
@RequestMapping(value = "/products") //nome do recurso
public class ProductResource {
	
	@Autowired
	private ProductService productService; //Injetando uma instancia do userService
	
	@GetMapping //Usado para definir que é uma chamada GET
	public ResponseEntity<List<Product>> findAll(){//metodo que busca todos os usuarios por id
		
		List<Product> list = productService.findAll();
		
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value = "/{id}")//declara que o metodo vai passar um id
	public ResponseEntity<Product> findById(@PathVariable Long id){ //@Pathvariable define a passagem dessa variavel id (VITAL)
		
		Product obj = productService.findById(id); //recebe o metodo findbyId do ProductService
		return ResponseEntity.ok().body(obj);
	}

}
