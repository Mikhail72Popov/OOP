package org.example.Seminar05.hw.service;

import org.example.Seminar05.hw.model.User;
import org.example.Seminar05.hw.view.Messages;

public class UserService {
    public User createUser(int id, String name){
        return new User(id,name);
    }
    public void changeBalance(User user, int amount){
        user.changeBalance(amount);
        Messages.ShowOperation(amount);
    }
}
