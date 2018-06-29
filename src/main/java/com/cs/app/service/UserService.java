package com.cs.app.service;

import com.cs.app.dao.UserDAO;
import com.cs.app.model.User;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class UserService {

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserDAO userDAO;

    public List<User> getUsers() {
        LOG.info("1234");
        return userDAO.getUsers();
    }

    public User getUser(int id) {
        LOG.warn("12 {} k12 {}", id, "45");
        return userDAO.getUser(id);
    }

}
