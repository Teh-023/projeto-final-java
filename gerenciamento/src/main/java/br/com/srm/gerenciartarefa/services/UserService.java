package br.com.srm.gerenciartarefa.services;

import org.apache.catalina.User;

public interface UserService {


    static User getUsername(User username) {
        return username;
    }
    
}