package com.cs.app.dao;

import com.cs.app.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO {

    public List<User> getUsers();

    User getUser(int id);
}
