package com.desafio.orange.controller;

import java.util.List;
import java.util.Optional;

import com.desafio.orange.dto.DetalharEnderecoDto;
import com.desafio.orange.dto.input.EnderecoInput;
import com.desafio.orange.dto.output.EnderecoOutput;
import com.desafio.orange.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/endereco")
public class EnderecoController {

	private static EnderecoService enderecoService;

	//Listando todos os endereços por idUser
	@GetMapping("/{usuarioId}")
	ResponseEntity<List<EnderecoOutput>> listar(@PathVariable Long usuarioId){
		var enderecos = enderecoService.buscarEnderecosPorUsuario(usuarioId);
		return ResponseEntity.ok((List<EnderecoOutput>) enderecos);
	}

	//Listando endereço por id endereço
	@GetMapping("/{id}")
	ResponseEntity<Optional<DetalharEnderecoDto>> detalharEndereco(@PathVariable Long id){
		var endereco = enderecoService.detalharEnderecoPorId(id);
		return ResponseEntity.ok(endereco);
	}
	
	@PostMapping("/cadastrar")
	ResponseEntity<String> salvar(@RequestBody EnderecoInput endereco) {
		var body = enderecoService.cadastrar(endereco);
		return ResponseEntity.status(HttpStatus.CREATED).body("Endereço cadastrado com Sucesso:" + body);
	}
	

	
	
	
}
