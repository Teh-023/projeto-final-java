package br.com.srm.gerenciartarefa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.srm.gerenciartarefa.entidades.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User getUsername(String username);
    
}