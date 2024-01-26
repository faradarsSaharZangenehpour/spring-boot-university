package ir.isc.controller;

import ir.isc.model.Professor;
import ir.isc.model.Student;
import ir.isc.service.ProfessorService;
import ir.isc.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ProfessorController {

    private ProfessorService professorService;

    @PostMapping("/create-professor")
    public ResponseEntity<Professor> createProfessor(@RequestBody Professor professor){
        return ResponseEntity.ok().body(this.professorService.createProfessor(professor));
    }
}
