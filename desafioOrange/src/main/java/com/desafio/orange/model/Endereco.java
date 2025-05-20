package com.desafio.orange.model;

import javax.persistence.*;

import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@AllArgsConstructor
@Entity
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String logradouro;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	private Usuario usuario;
	
}
