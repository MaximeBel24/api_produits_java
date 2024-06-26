package com.moimeme.produits;

import com.moimeme.produits.entities.Categorie;
import com.moimeme.produits.entities.Produit;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class ProduitsApplication implements CommandLineRunner {

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {

		SpringApplication.run(ProduitsApplication.class, args);
	}

	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Produit.class, Categorie.class);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
