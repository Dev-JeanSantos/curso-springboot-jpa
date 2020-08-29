package com.fourtk.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fourtk.curso.entities.Category;
import com.fourtk.curso.repositories.CategoryRepository;

@Service //Registro do tipo Service da minha classe no Spring (VITAL)
public class CategoryService { //Camada responsavel pelas regras de serviço do sistema que depende da camada resources
	
	@Autowired
	private CategoryRepository orderRepository;
	
	//Chamada de busca p/ todos os usuarios
	public List<Category> findAll(){
		
		return orderRepository.findAll(); //Chamada do metodo no CategoryRepository (verificar lá)
		
	}
	
	//Chamada de busca de usuario por id
	public Category findById(Long id) {
		
		//criação da variavel Optional recebendo o retorno do usuario por id
		Optional<Category> obj = orderRepository.findById(id);
		return obj.get(); //Get retorna o Objeto com a informação da busca
		
	}
}
