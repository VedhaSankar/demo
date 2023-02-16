package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service // indicates that the class needs to be instantiated
public class StudentService {
    public List<Student> getStudents(){

//		returns string
//		return "Hello World";

//		returns json
        return List.of(
                new Student(1L,
                        "Mariam",
                        21,
                        LocalDate.of(2000, 10, 23),
                        "mariam.jamal@gmail.com"
                )
        );
    }

}
