package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Evento;
import com.example.demo.repository.EventoRepository;

@Service
public class EventoService implements CrudInterface<Evento> {

	
	@Autowired
	private EventoRepository eventorepository;
	 
	@Override
	public List<Evento> findAll() {
		
		return eventorepository.findAll();
	}

	@Override
	public Optional<Evento> save(Evento entity) {
		
		return Optional.of(eventorepository.save(entity));
	}

	@Override
	public Optional<Evento> findById(long id) {
		
		return eventorepository.findById(id);
	}

	@Override
	public void delete(Evento entity) {
		eventorepository.delete(entity);
		
	}

	@Override
	public void deleteById(long id) {
		eventorepository.deleteById(id);
		
	}

	@Override
	public long count() {
		
		return eventorepository.count();
	}
	
	

}
