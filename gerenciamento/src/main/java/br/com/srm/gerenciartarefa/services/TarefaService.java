package br.com.srm.gerenciartarefa.services;

import java.util.Optional;

import br.com.srm.gerenciartarefa.entidades.Tarefa;

public interface TarefaService {

    static void save(Tarefa tarefa) {
    }

    static Optional<Tarefa> findById(Long id) {
        return null;
    }

    static void excluir(Tarefa tarefa) {
    }
    
}