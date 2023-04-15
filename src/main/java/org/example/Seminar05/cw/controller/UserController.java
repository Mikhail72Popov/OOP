package org.example.Seminar05.cw.controller;

import org.example.Seminar05.cw.model.User;
import org.example.Seminar05.cw.service.UserService;
public class UserController {
    private UserService userService = new UserService();
    public void saveNewUser(Integer userID, String name, int age){
        userService.saveUser(new User(userID, name, age));
    }
    public void deleteUser(User user){
        userService.deleteFromRepo(user);
    }
    public User getUser(User user){
        return userService.getUserFromRepo(user);
    }
    public void addUserToRepo(User user){
        userService.addUserToRepo(user);
    }
}
