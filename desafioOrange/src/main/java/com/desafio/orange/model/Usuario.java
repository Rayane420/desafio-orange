package com.desafio.orange.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;


@Data
@AllArgsConstructor
@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long usuarioId;
	
	@NotBlank(message = "Por gentileza Informe o nome do usuário!")
	private String nome;
	
	@Email
	@Column(unique = true)
	@NotBlank(message = "Por gentileza Informe o email!")
	private String email;
	
	@Column(unique = true)
	@NotBlank(message = "Por gentileza Informe o cpf!")
	private String cpf;
	
	@NotBlank(message = "Por gentileza Informe a data de nascimento do usuário!")
	@JsonFormat(pattern = "dd/MM/yyyy") 
	private String dataNascimento;
	
	private String sexo;
	private String telefone;
	private String nacionalidade;

}
