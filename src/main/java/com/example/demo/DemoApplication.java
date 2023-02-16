package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController // makes the class serve rest endpoints
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/") // rest end point
	public List<Student> hello(){

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
