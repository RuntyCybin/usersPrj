package com.cybin.userprj;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/users")
public class UsersController {

    @Autowired
    UsersService usersService;

    @GetMapping("/withEmail")
    public ResponseEntity<Users> getMethodName(@RequestParam String email) {
        Users response = usersService.findUser(email);
        return new ResponseEntity<Users>(response, null, HttpStatus.SC_OK);
    }

}
