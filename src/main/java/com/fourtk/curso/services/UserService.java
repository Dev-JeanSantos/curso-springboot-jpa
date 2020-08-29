package com.fourtk.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fourtk.curso.entities.User;
import com.fourtk.curso.repositories.UserRepository;

@Service //Registro do tipo Service da minha classe no Spring (VITAL)
public class UserService { //Camada responsavel pelas regras de serviço do sistema que depende da camada resources
	
	@Autowired
	private UserRepository userRepository;
	
	//Chamada de busca p/ todos os usuarios
	public List<User> findAll(){
		
		return userRepository.findAll(); //Chamada do metodo no UserRepository (verificar lá)
		
	}
	
	//Chamada de busca de usuario por id
	public User findById(Long id) {
		
		//criação da variavel Optional recebendo o retorno do usuario por id
		Optional<User> obj = userRepository.findById(id);
		return obj.get(); //Get retorna o Objeto com a informação da busca
		
	}
}
