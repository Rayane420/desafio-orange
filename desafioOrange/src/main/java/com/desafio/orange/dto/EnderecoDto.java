package com.desafio.orange.dto;

import com.desafio.orange.model.Endereco;

import java.util.List;
import java.util.stream.Collectors;

public class EnderecoDto {

    private int numero;
    private String cidade;
    private String estado;
    private String CEP;

    public EnderecoDto(Endereco endereco) {
        this.numero = endereco.getNumero();
        this.cidade = endereco.getCidade();
        this.estado = endereco.getEstado();
        this.CEP = endereco.getCEP();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    //Convertendo entidade para classe Dto
    public static List<EnderecoDto> converter(List<Endereco> enderecos) {
        return enderecos.stream().map(EnderecoDto::new).collect(Collectors.toList());
    }
}
