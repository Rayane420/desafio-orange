package com.desafio.orange.controller;

import java.util.List;

import com.desafio.orange.dto.DetalharEnderecoDto;
import com.desafio.orange.dto.EnderecoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.desafio.orange.model.Endereco;
import com.desafio.orange.repository.EnderecoRepository;



@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

	@Autowired
	private EnderecoRepository enderecoRepository;


	@GetMapping
	List<EnderecoDto> listar(){
		List<Endereco> enderecos = enderecoRepository.findAll();
		return EnderecoDto.converter(enderecos);
	}

	@GetMapping("/{id}")
	DetalharEnderecoDto detalhar(@PathVariable Long id){
		Endereco endereco = enderecoRepository.getById(id);
		return new DetalharEnderecoDto(endereco);
	}
	
	@PostMapping("/endereco")
	@ResponseStatus(HttpStatus.CREATED)
	Endereco salvar(@RequestBody Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
	

	
	
	
}
