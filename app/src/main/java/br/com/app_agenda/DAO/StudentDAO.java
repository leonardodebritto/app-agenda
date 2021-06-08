package br.com.app_agenda.DAO;

import java.util.ArrayList;
import java.util.List;
import br.com.app_agenda.model.Student;

public class StudentDAO {

    private final static List<Student> student_ = new ArrayList<>();

    public void save(Student student) {
        student_.add(student);
    }

    public List<Student> todos() {
        return new ArrayList<>(student_);
    }
}
