package com.fourtk.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fourtk.curso.entities.Product;
import com.fourtk.curso.repositories.ProductRepository;

@Service //Registro do tipo Service da minha classe no Spring (VITAL)
public class ProductService { //Camada responsavel pelas regras de serviço do sistema que depende da camada resources
	
	@Autowired
	private ProductRepository orderRepository;
	
	//Chamada de busca p/ todos os usuarios
	public List<Product> findAll(){
		
		return orderRepository.findAll(); //Chamada do metodo no ProductRepository (verificar lá)
		
	}
	
	//Chamada de busca de usuario por id
	public Product findById(Long id) {
		
		//criação da variavel Optional recebendo o retorno do usuario por id
		Optional<Product> obj = orderRepository.findById(id);
		return obj.get(); //Get retorna o Objeto com a informação da busca
		
	}
}
