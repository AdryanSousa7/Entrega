package com.todo.lista.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.lista.dto.UsuarioDTO;
import com.todo.lista.entities.Usuario;
import com.todo.lista.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	// serve para adicionar novos usuarios
	public UsuarioDTO salvar(UsuarioDTO dto) {
		Usuario usuario = new Usuario();
		usuario.setNome(dto.getNome());
		usuario.setEmail(dto.getEmail());
		
		usuario = usuarioRepository.save(usuario);
		
		return new UsuarioDTO(usuario);
	}

}
