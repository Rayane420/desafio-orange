package com.desafio.orange.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
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

	//ligação um para muitos mapeado pelo usuario
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<Endereco> enderecos = new ArrayList<>();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
