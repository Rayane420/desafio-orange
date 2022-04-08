package com.desafio.orange.controller;

import java.util.List;

import com.desafio.orange.dto.EnderecoDto;
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



@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

	@Autowired
	private EnderecoRepository enderecoRepository;


	@GetMapping
	public List<EnderecoDto> listar(){
		List<Endereco> enderecos = enderecoRepository.findAll();
		return EnderecoDto.converter(enderecos);
	}

	@GetMapping("/{id}")
	public Endereco listarUm(@PathVariable long id){
		return enderecoRepository.findById(id);
	}
	
	@PostMapping("/endereco")
	@ResponseStatus(HttpStatus.CREATED)
	public Endereco salvar(@RequestBody Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
	

	
	
	
}
