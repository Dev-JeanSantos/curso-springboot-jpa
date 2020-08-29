package com.fourtk.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.fourtk.curso.entities.User;
import com.fourtk.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {//Classe reposnsavel por operaçoes no bd
	
	@Autowired //Dependencia de Injeção
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		//Objetos Instanciados e populados hard core
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		//user userRepository é responsavel por operações no bd (crude)
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}

}
