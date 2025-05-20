package com.desafio.orange.dto.output;

import lombok.*;

@Data
@AllArgsConstructor
public class EnderecoOutput {

    private int numero;
    private String cidade;
    private String estado;
    private String CEP;

}
