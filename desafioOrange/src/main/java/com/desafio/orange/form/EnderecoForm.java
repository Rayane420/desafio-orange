package com.desafio.orange.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class EnderecoForm {
    @NotBlank(message = "Por gentileza Informe o Logradouro!")
    private String logradouro;

    @NotNull
    private int numero;

    @NotBlank(message = "Por gentileza Informe o complemento!")
    private String complemento;

    @NotBlank(message = "Por gentileza Informe o bairro!")
    private String bairro;

    @NotBlank(message = "Por gentileza Informe a cidade!")
    private String cidade;

    @NotBlank(message = "Por gentileza Informe o estado!")
    private String estado;

    @NotBlank(message = "Por gentileza Informe o CEP!")
    private String CEP;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
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
}
