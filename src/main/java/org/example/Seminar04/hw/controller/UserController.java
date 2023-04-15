package org.example.Seminar04.hw.controller;
import org.example.Seminar04.hw.data.User;
import java.time.LocalDate;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}