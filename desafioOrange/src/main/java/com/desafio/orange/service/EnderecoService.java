package com.desafio.orange.service;

import com.desafio.orange.dto.DetalharEnderecoDto;
import com.desafio.orange.dto.input.EnderecoInput;
import com.desafio.orange.dto.output.EnderecoOutput;
import com.desafio.orange.model.Endereco;
import com.desafio.orange.repository.EnderecoRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class EnderecoService {

    private static EnderecoRepository enderecoRepository;
    private final ModelMapper modelMapper;

    public List<EnderecoOutput> buscarEnderecosPorUsuario(Long usuarioId){
        List<EnderecoOutput> enderecos = enderecoRepository
                .findAll()
                .stream()
                .map(endereco -> modelMapper.map(endereco, EnderecoOutput.class))
                .collect(Collectors.toList());
        return enderecos;
    }

    public Optional<DetalharEnderecoDto> detalharEnderecoPorId(Long id){
        var enderecos = enderecoRepository.findById(id);
        return enderecos.map(endereco -> modelMapper.map(endereco, DetalharEnderecoDto.class));
    }

    public Endereco cadastrar(EnderecoInput enderecoInput) {
        Endereco endereco = modelMapper.map(enderecoInput, Endereco.class);
        return enderecoRepository.save(endereco);
    }
}
