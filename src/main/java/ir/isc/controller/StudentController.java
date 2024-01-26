package ir.isc.controller;

import ir.isc.model.Product;
import ir.isc.model.Student;
import ir.isc.payload.request.StudentDto;
import ir.isc.payload.response.MessageResponse;
import ir.isc.repository.StudentRepository;
import ir.isc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/create-student")
    public ResponseEntity<?> createStudent(@Valid @RequestBody StudentDto studentDto){
        if (studentRepository.existsByNationalCode(studentDto.getNationalCode())) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: Student is already registered!"));
        }
        this.studentService.createStudent(studentDto);
        return ResponseEntity.ok(new MessageResponse("Student registered successfully!"));
    }
}
