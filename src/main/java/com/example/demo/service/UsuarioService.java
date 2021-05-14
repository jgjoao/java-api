package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.Usuario;

import com.example.demo.repository.UsuarioRepository;

@Service
public class UsuarioService implements CrudInterface<Usuario>{
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> findAll() {
		
		return usuarioRepository.findAll();
	}

	@Override
	public Optional<Usuario> save(Usuario entity) {
		
		return Optional.of(usuarioRepository.save(entity));
	}

	@Override
	public Optional<Usuario> findById(long id) {
		
		return usuarioRepository.findById(id);
	}

	@Override
	public void delete(Usuario entity) {
		usuarioRepository.delete(entity);
		
	}

	@Override
	public void deleteById(long id) {
		usuarioRepository.deleteById(id);
		
	}

	@Override
	public long count() {
		
		return usuarioRepository.count();
	}

}
