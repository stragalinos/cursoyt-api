package com.jean.cursoyt;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jean.cursoyt.domain.Categoria;
import com.jean.cursoyt.domain.Livro;
import com.jean.cursoyt.repositories.CategoriaRepository;
import com.jean.cursoyt.repositories.LivroRepository;

@SpringBootApplication
public class CursoytApplication implements CommandLineRunner {
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursoytApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informatica", "Livro de TI");
		
		Livro l1 = new Livro(null,"Clean code","Robert Martin", "Lorem ipsum", cat1);
		
		cat1.getLivros().addAll(Arrays.asList(l1));
		this.categoriaRepository.saveAll(Arrays.asList(cat1));
		this.livroRepository.saveAll(Arrays.asList(l1));
	}
	
	
	
}
