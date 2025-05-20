package com.desafio.orange.dto.input;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsuarioInput {

    private Long id;
    private String nome;
    private String email;
    private String cpf;

}
