package org.example.Seminar05.cw.repo;

import org.example.Seminar05.cw.model.User;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private List<User> db = new ArrayList<>();
    public UserRepo(List<User> db){
        this.db = new ArrayList<>();
    }
    public UserRepo(){
    }
    public void addUserToRepo(User user){
        db.add(user);
    }
    public void deleteFromRepo(User user){
        db.remove(user);
    }
    public User getUserFromRepo(User user){
        for (User el : db){
            if (el.getUserID().equals(user.getUserID())){
                return el;
            }
        }
        return null;
    }
    public void saveUser(User user){
        try(FileWriter fileWriter = new FileWriter("text.txt", true)){
            fileWriter.write(user.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
