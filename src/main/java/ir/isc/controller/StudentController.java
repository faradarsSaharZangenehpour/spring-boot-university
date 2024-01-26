package ir.isc.controller;

import ir.isc.model.Product;
import ir.isc.model.Student;
import ir.isc.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class StudentController {

    private StudentService studentService;

    @PostMapping("/create-student")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        return ResponseEntity.ok().body(this.studentService.createStudent(student));
    }
}
