package com.desafio.orange.dto;

import com.desafio.orange.dto.output.EnderecoOutput;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DetalharUsuarioDto {

    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private String dataNascimento;
    private String sexo;
    private String telefone;
    private String nacionalidade;
    private List<EnderecoOutput> enderecos = new ArrayList<>();

}
