package com.desafio.orange.dto;

import lombok.Data;

@Data
public class DetalharEnderecoDto {

    private Long id;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String CEP;
    private String usuario;

}
