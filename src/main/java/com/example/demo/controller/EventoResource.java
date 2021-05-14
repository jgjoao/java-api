package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Evento;
import com.example.demo.service.EventoService;


@RestController
@RequestMapping("/api")
public class EventoResource {
	
	@Autowired
	private EventoService eventoservice;
	
	
	@GetMapping("/evento/listar")
	
	public List<Evento> getEvento() {

		return eventoservice.findAll();
	}

	@PostMapping("/evento")
	public ResponseEntity<Evento> save(@RequestBody Evento evento) {

		evento= eventoservice.save(evento).get();

		return ResponseEntity.ok().body(evento);
	}

	@PutMapping("/evento")
	public ResponseEntity<Evento> update(@RequestBody Evento evento) {

		evento= eventoservice.save(evento).get();

		return ResponseEntity.ok().body(evento);
	}

	@DeleteMapping("/evento/delete")
	public ResponseEntity<String> delete(@RequestBody Evento evento) {

		eventoservice.delete(evento);
		return ResponseEntity.ok().body("Evento excluido " + evento.getId());
	}
	
	
	
	
	
}
