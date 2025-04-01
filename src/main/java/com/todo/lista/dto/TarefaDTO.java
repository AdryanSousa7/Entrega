package com.todo.lista.dto;

import java.time.LocalDate;

import com.todo.lista.entities.Tarefas;
import com.todo.lista.entities.enums.Prioridade;
import com.todo.lista.entities.enums.Status;

public class TarefaDTO {

	private Long id;
	private String descricao;
	private String setor;
	private Prioridade prioridade;
	private LocalDate dataCadastro;
	private Status status;
	private Long idUsuario;
	
	public TarefaDTO() {
	}

	public TarefaDTO(Long id, String descricao, String setor, Prioridade prioridade, LocalDate dataCadastro,
			Status status, Long idUsuario) {
		this.id = id;
		this.descricao = descricao;
		this.setor = setor;
		this.prioridade = prioridade;
		this.dataCadastro = dataCadastro;
		this.status = status;
		this.idUsuario = idUsuario;
	}
	
	public TarefaDTO(Tarefas entity) {
		id = entity.getId();
		descricao = entity.getDescricao();
		setor = entity.getSetor();
		prioridade = entity.getPrioridade();
		dataCadastro = entity.getDataCadastro();
		status = entity.getStatus();
		idUsuario = entity.getUsuario().getId();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public Prioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
}
