package ir.isc.controller;

import ir.isc.model.Course;
import ir.isc.model.Professor;
import ir.isc.model.Student;
import ir.isc.payload.request.ProfessorDto;
import ir.isc.payload.response.MessageResponse;
import ir.isc.repository.CourseRepository;
import ir.isc.repository.ProfessorRepository;
import ir.isc.service.ProfessorService;
import ir.isc.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashSet;
import java.util.Set;

@RestController
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @Autowired
    private ProfessorRepository professorRepository;

    @Autowired
    private CourseRepository courseRepository;

    @PostMapping("/create-professor")
    public ResponseEntity<?> createProfessor(@Valid @RequestBody ProfessorDto professorDto){
        if (professorRepository.existsByNationalCode(professorDto.getNationalCode())) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: Professor is already registered!"));
        }

        Professor p =this.professorService.createProfessor(professorDto);
        if (p == null){
            return ResponseEntity.badRequest().body(new MessageResponse("Course is not Defined"));
        } else{
            return ResponseEntity.ok(new MessageResponse("Professor registered successfully!"));
        }

    }
}
