package com.desafio.orange.dto.output;

import lombok.*;

@Data
@AllArgsConstructor
public class UsuarioOutput {

    private Long id;
    private String nome;
    private String email;
    private String cpf;

}
