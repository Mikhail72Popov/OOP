package org.example.Seminar05.cw.service;

import org.example.Seminar05.cw.model.User;
import org.example.Seminar05.cw.repo.UserRepo;

public class UserService {
    private UserRepo userRepo = new UserRepo();
    public void saveUser(User user){
        userRepo.saveUser(user);
    }
    public void deleteFromRepo(User user){
        userRepo.deleteFromRepo(user);
    }
    public User getUserFromRepo(User user){
        return userRepo.getUserFromRepo(user);
    }
    public void addUserToRepo(User user){
        userRepo.addUserToRepo(user);
    }
}
