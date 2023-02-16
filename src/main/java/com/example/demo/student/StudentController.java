package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //  if you've used @requestmapping to give the path then dont include the path here ie, dont use the below:
    //  @GetMapping("/")
    @GetMapping // rest end point
    public List<Student> getStudents(){

        return studentService.getStudents();

    }


}
