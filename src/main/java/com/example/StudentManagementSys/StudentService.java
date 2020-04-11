package com.example.StudentManagementSys;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Iterator;
import java.util.ListIterator;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudentsByName(Student student) {
        studentRepository.save(student);
    }

    public Iterable<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentsByName(@RequestBody String name) {
        return studentRepository.getStudent(name);
    }

    public int deleteStudentsByName(@RequestBody String name) {
        return studentRepository.deleteStudentByName(name);
    }
}
