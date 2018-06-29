package com.cs.app.controller;


import com.cs.app.model.User;
import com.cs.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController(value= "/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getUsers() {

        return userService.getUsers();

    }

    @GetMapping(value="/user/{id}")
    public User getUser(@PathVariable int id){
        return userService.getUser(id);
    }
}
