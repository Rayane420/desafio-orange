package com.desafio.orange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.orange.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	//Método personalizado para buscar um unico usuário pelo id, cpf e email -------
	public Usuario findByCpf(String cpf);
	public Usuario findByEmail(String email);
	Usuario findById(long id);
}
