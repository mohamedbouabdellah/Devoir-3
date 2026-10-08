package com.mohamed.phones;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.mohamed.phones.entities.Phone;

import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
public class PhonesApplication implements CommandLineRunner {
	
	//@Autowired
	private final RepositoryRestConfiguration repositoryRestConfiguration;	

	public static void main(String[] args) {
		SpringApplication.run(PhonesApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Phone.class);
	}


}
