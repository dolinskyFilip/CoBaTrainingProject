package com.cs.app.dao;

import com.cs.app.DummyGenerator;
import com.cs.app.model.User;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("/dummy")
@Primary
public class UserDAODummy implements UserDAO {



    @Override
    public List<User> getUsers() {
        return DummyGenerator.generateUser(10);
    }

    @Override
    public User getUser(int id) {

        return new User(id,"Franek","Kowalski", true);
    }
}
