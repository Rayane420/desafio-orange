package com.desafio.orange.dto;

import com.desafio.orange.model.Usuario;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioDto {

    private Long id;
    private String nome;
    private String email;
    private String cpf;

    public UsuarioDto(Usuario usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.cpf = usuario.getCpf();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //Convertendo entidade para classe Dto
    public static List<UsuarioDto> converter(List<Usuario> usuarios) {
        return usuarios.stream().map(UsuarioDto::new).collect(Collectors.toList());
    }
}
