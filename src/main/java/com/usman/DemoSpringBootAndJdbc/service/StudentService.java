package com.usman.DemoSpringBootAndJdbc.service;

import com.usman.DemoSpringBootAndJdbc.model.Student;
import com.usman.DemoSpringBootAndJdbc.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository str;

    public StudentRepository getStr() {
        return str;
    }

    @Autowired
    public void setStr(StudentRepository str) {
        this.str = str;
    }

    public void addStudent(Student student){
        str.save(student);
    }

    public List<Student> getStudents() {
        return str.findAll();
    }
}
