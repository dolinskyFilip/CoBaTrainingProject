package com.cs.app.service;

import com.cs.app.dao.UserDAO;
import com.cs.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    UserDAO userDAO;

    public List<User> getUsers() {

        return userDAO.getUsers();
    }

    public User getUser(int id){
        return userDAO.getUser(id);
    }

}
