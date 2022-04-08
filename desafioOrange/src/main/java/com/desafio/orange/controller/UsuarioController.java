package com.desafio.orange.controller;

import com.desafio.orange.dto.DetalharUsuarioDto;

import com.desafio.orange.dto.UsuarioDto;

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

import java.util.List;


@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	//Listando todos os usuários
	@GetMapping
	List<UsuarioDto> listar(){
		List<Usuario> usuarios = usuarioRepository.findAll();
		return UsuarioDto.converter(usuarios);
	}

	//Detalhando Endereços por Usuário
	@GetMapping("/enderecos/{id}")
	DetalharUsuarioDto detalhar(@PathVariable Long id){
		Usuario usuario = usuarioRepository.getById(id);
		return new DetalharUsuarioDto(usuario);
	}




	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	Usuario salvar(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	

	
	
}
