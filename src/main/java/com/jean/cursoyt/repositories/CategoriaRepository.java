package com.jean.cursoyt.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jean.cursoyt.domain.Categoria;
import com.jean.cursoyt.domain.Livro;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

 
	
}
