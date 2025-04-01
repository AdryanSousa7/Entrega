package com.todo.lista.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.todo.lista.dto.TarefaDTO;
import com.todo.lista.entities.Tarefas;
import com.todo.lista.services.TarefaService;

import jakarta.validation.Valid;

@RequestMapping("tarefa")
@RestController
public class TarefaController {
	
	@Autowired
	TarefaService tarefaService;
	
	@PostMapping
	public ResponseEntity<TarefaDTO> criarTarefa(@Valid @RequestBody TarefaDTO dto) {
		dto = tarefaService.salvarTarefa(dto);
		return ResponseEntity.ok(dto);
	}
	
	@GetMapping
	public ResponseEntity<List<Tarefas>> listarTarefas() {
		return ResponseEntity.ok(tarefaService.listarTarefas());
	}
}
