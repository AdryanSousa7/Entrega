package com.todo.lista.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.lista.dto.TarefaDTO;
import com.todo.lista.entities.Tarefas;
import com.todo.lista.entities.Usuario;
import com.todo.lista.entities.enums.Prioridade;
import com.todo.lista.entities.enums.Status;
import com.todo.lista.repositories.TarefaRepository;
import com.todo.lista.repositories.UsuarioRepository;

@Service
public class TarefaService {

	@Autowired
	TarefaRepository tarefaRepository;
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public TarefaDTO salvarTarefa(TarefaDTO dto) {

		Tarefas task = new Tarefas();
		
		task.setDescricao(dto.getDescricao());
		task.setSetor(dto.getSetor());
		task.setPrioridade(Prioridade.ALTA);
		task.setDataCadastro(LocalDate.now());
		task.setStatus(Status.A_FAZER);
		
		Usuario user = usuarioRepository.getReferenceById(dto.getIdUsuario());
		
		task.setUsuario(user);
		
		task = tarefaRepository.save(task);
		
		return new TarefaDTO(task);
	}
	
	public List<Tarefas> listarTarefas(){
		List<Tarefas> tarefas = tarefaRepository.findAll();
		return tarefas;
	}
}
