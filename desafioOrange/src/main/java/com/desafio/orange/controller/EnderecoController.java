package com.desafio.orange.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.orange.model.Endereco;
import com.desafio.orange.repository.EnderecoRepository;
import com.desafio.orange.repository.UsuarioRepository;



@RestController
@RequestMapping
public class EnderecoController {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	
	/** Cadastro de Endereços ---------*/
	@PostMapping("/endereco")
	@ResponseStatus(HttpStatus.CREATED)
	public Endereco salvar(@RequestBody Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
	
	/** Listando Endereços ---------*/
	@GetMapping("/endereco")
	public List<Endereco> listar(){
		return enderecoRepository.findAll();
	}
	
	/** Listando Endereços ---------*/
	
	@GetMapping("/endereco/{id}") 
	public Endereco listarUm(@PathVariable long id){ 
		return enderecoRepository.findById(id); //usando o método criado para listar um unico endereço
	}
	
	
	
}
