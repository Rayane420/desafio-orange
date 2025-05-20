package com.desafio.orange.service;

import com.desafio.orange.dto.input.UsuarioInput;
import com.desafio.orange.dto.output.UsuarioOutput;

import com.desafio.orange.model.Usuario;
import com.desafio.orange.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UsuarioService {

    private static UsuarioRepository usuarioRepository;
    private final ModelMapper modelMapper;


    public List<UsuarioOutput> findAll() {
        List<UsuarioOutput> usuarios = usuarioRepository
                .findAll()
                .stream()
                .map(usuario -> modelMapper.map(usuario, UsuarioOutput.class))
                .collect(Collectors.toList());
        return usuarios;
    }

    public Usuario cadastrar(UsuarioInput usuarioInput) {
        Usuario usuario = modelMapper.map(usuarioInput, Usuario.class);
        return usuarioRepository.save(usuario);
    }

}
