package com.desafio.orange.dto.input;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoInput {
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

}
