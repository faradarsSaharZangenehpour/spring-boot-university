package ir.isc.controller;

import ir.isc.model.Professor;
import ir.isc.model.Student;
import ir.isc.payload.request.ProfessorDto;
import ir.isc.payload.response.MessageResponse;
import ir.isc.repository.ProfessorRepository;
import ir.isc.service.ProfessorService;
import ir.isc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @Autowired
    private ProfessorRepository professorRepository;

    @PostMapping("/create-professor")
    public ResponseEntity<?> createProfessor(@Valid @RequestBody ProfessorDto professorDto){
        if (professorRepository.existsByNationalCode(professorDto.getNationalCode())) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: Professor is already registered!"));
        }

        this.professorService.createProfessor(professorDto);
        return ResponseEntity.ok(new MessageResponse("Professor registered successfully!"));
    }
}
