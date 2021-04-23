package com.desafio.orange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.orange.model.Usuario;
import com.desafio.orange.repository.UsuarioRepository;



@RestController
@RequestMapping(value = "/api")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	/** Cadastro de Usuários ---------*/
	@PostMapping("/usuario")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario salvar(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	/** Listando Usuários e seus endereços ---------*/
	@GetMapping("/usuario/{id}")
		public Usuario listaPorId(@PathVariable long id){ 
			return usuarioRepository.findById(id);
		
		}
	
	
}
