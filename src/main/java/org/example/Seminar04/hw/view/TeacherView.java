package org.example.Seminar04.hw.view;

import java.util.List;
import java.util.logging.Logger;
import org.example.Seminar04.hw.data.Student;
import org.example.Seminar04.hw.data.StudentGroup;
import org.example.Seminar04.hw.data.Teacher;
public class TeacherView implements UserView<Teacher>{

    Logger logger = Logger.getLogger(TeacherView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for(Teacher user: teachers){
            logger.info(user.toString());
        }
    }

}
