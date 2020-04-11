package com.example.StudentManagementSys;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping("/addStudentsByName")
    public String addStudentsByName(@RequestBody Student student) {
        Student s = studentRepository.getStudent(student.getName());
        if (s != null){
            return "姓名重复";
        }else {
           studentRepository.save(student);
           return "添加成功";
        }
    }

    @GetMapping("/getAllStudents")
    public String getAllStudents() {
        return studentRepository.findAll().toString();
    }

    @PostMapping("/getStudentsByName")
    public String getStudentsByName(@RequestBody String name) {
        Student student = studentRepository.getStudent(name);
        if (student != null){
            return  student.toString();
        }else {
            return "找不到该学生";
        }
    }

    @PostMapping("/deleteStudentsByName")
    public String deleteStudentsByName(@RequestBody String name) {
        if (0 == studentRepository.deleteStudentByName(name)) {
            return "该学生不存在";
        } else {
            return "删除成功";
        }

    }


}
