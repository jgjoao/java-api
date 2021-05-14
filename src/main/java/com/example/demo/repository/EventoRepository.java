package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Evento;

import antlr.collections.List;


public interface EventoRepository extends JpaRepository<Evento,Long>{
	List findByNome(String nome);

}


