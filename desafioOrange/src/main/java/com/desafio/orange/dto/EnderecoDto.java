package com.desafio.orange.dto;

import com.desafio.orange.model.Endereco;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

    //Convertendo entidade para classe Dto
    public static List<EnderecoDto> converter(List<Endereco> enderecos) {
        return enderecos.stream().map(EnderecoDto::new).collect(Collectors.toList());
    }
}
