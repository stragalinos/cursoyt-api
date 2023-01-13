package com.jean.cursoyt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jean.cursoyt.domain.Categoria;

@Repository
public interface LivroRepository extends JpaRepository<Categoria, Integer> {
	
}