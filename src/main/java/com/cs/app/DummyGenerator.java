package com.cs.app;

import com.cs.app.model.User;

import java.util.ArrayList;
import java.util.List;

public class DummyGenerator {

    public static List<User> generateUser(int numberOfUsers){
        List<User> userLitst=new ArrayList<>();
        for (int i = 0; i <numberOfUsers ; i++) {
            userLitst.add(
                    new User(
                            i,
                            "Franek"+ i,
                            "Kowalski" + i,
                            true
                    )
            );

        }

        return userLitst;
    }
}
