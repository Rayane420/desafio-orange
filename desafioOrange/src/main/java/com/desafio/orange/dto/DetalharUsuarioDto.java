package com.desafio.orange.dto;

import com.desafio.orange.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class DetalharUsuarioDto {

    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private String dataNascimento;
    private String sexo;
    private String telefone;
    private String nacionalidade;
    private List<EnderecoDto> enderecos = new ArrayList<>();

    public DetalharUsuarioDto(Usuario usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.cpf = usuario.getCpf();
        this.dataNascimento = usuario.getDataNascimento();
        this.sexo = usuario.getSexo();
        this.telefone = usuario.getTelefone();
        this.nacionalidade = usuario.getNacionalidade();
        this.enderecos = new ArrayList<>();
        this.enderecos.addAll(usuario.getEnderecos().stream().map(EnderecoDto::new).collect(Collectors.toList()));
    }

}
