package br.com.srm.gerenciartarefa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.srm.gerenciartarefa.entidades.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    
}