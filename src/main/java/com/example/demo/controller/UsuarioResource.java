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
import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioResource {
	
	
	@Autowired
	private UsuarioService usuarioService;
	
	
	@GetMapping("/usuario/listar")
	
	public List<Usuario> getEvento() {

		return usuarioService.findAll();
	}

	@PostMapping("/usuario")
	public ResponseEntity<Usuario> save(@RequestBody Usuario usuario) {

		usuario= usuarioService.save(usuario).get();

		return ResponseEntity.ok().body(usuario);
	}

	@PutMapping("/usuario")
	public ResponseEntity<Usuario> update(@RequestBody Usuario usuario) {

		usuario= usuarioService.save(usuario).get();

		return ResponseEntity.ok().body(usuario);
	}

	@DeleteMapping("/usuario/delete")
	public ResponseEntity<String> delete(@RequestBody Usuario usuario) {

		usuarioService.delete(usuario);
		return ResponseEntity.ok().body("Evento excluido " + usuario.getId());
	}

}
