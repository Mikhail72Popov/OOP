package org.example.Seminar04.hw.service;
import org.example.Seminar04.hw.data.Student;
import org.example.Seminar04.hw.data.Teacher;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {

    private final List<Teacher> students;

    public TeacherService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (Teacher teacher: students){
            if (teacher.getTeacherId() > countMaxId){
                countMaxId = teacher.getTeacherId();
            }
        }
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        students.add(teacher);
    }
}
