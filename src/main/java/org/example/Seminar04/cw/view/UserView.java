package org.example.Seminar04.cw.view;

import org.example.Seminar04.cw.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}