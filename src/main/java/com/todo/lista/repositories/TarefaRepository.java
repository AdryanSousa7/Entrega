package com.todo.lista.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.lista.entities.Tarefas;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefas, Long> {

}
