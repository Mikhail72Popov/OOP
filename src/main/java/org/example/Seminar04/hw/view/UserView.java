package org.example.Seminar04.hw.view;
import org.example.Seminar04.hw.data.User;
import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}