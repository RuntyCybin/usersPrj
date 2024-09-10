package com.cybin.userprj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    private UsersRepository repository;

    public Users findUser(String email) {

        return this.repository.findByEmail(email).get();
    }
}
