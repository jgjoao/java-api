package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Usuario;

import antlr.collections.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	List findByNome(String nome);
}
