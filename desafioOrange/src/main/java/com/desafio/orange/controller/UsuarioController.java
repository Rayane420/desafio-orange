package com.desafio.orange.controller;

import com.desafio.orange.dto.DetalharUsuarioDto;

import com.desafio.orange.dto.input.EnderecoInput;
import com.desafio.orange.dto.input.UsuarioInput;
import com.desafio.orange.dto.output.UsuarioOutput;

import com.desafio.orange.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

	private static UsuarioService usuarioService;

	//Listando todos os usuários
	@GetMapping
	ResponseEntity<List<UsuarioOutput>> listar(){
		List<UsuarioOutput> usuarios = usuarioService.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(usuarios);
	}

	@PostMapping("/cadastrar")
	ResponseEntity<String> salvar(@RequestBody UsuarioInput usuario) {
		var body = usuarioService.cadastrar(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body("Usuario cadastrado com sucesso");
	}
	
}
