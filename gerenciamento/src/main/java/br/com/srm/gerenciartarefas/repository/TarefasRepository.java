package br.com.srm.gerenciartarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.srm.gerenciartarefas.model.entidades.Tarefas;

@Repository
public interface TarefasRepository extends JpaRepository<Tarefas, Long>{


}
