package org.example.Seminar06.hw.view;

import org.example.Seminar06.hw.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}