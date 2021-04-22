package com.desafio.orange.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.orange.model.Usuario;
import com.desafio.orange.repository.UsuarioRepository;



@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping //mapeando a solicitação
	public List<Usuario> listar(){
		return usuarioRepository.findAll();
	}
	
}
