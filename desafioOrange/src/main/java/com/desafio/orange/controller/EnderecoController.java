package com.desafio.orange.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.orange.model.Endereco;
import com.desafio.orange.repository.EnderecoRepository;



@RestController
@RequestMapping("/usuario")
public class EnderecoController {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	/** Listando Endereços ---------*/
	@GetMapping 
	public List<Endereco> listar(){
		return enderecoRepository.findAll();
	}
	
	
	/** Criando Endereço ---------*/
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Endereco salvar(@RequestBody Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
	
	
	
}
