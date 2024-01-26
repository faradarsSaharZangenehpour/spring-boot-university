package ir.isc.service;

import ir.isc.model.Professor;
import ir.isc.model.Student;
import ir.isc.repository.ProfessorRepository;
import ir.isc.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorServiceImpl implements ProfessorService{

    @Autowired
    private ProfessorRepository professorRepository;
    @Override
    public Professor createProfessor(Professor professor) {
        return professorRepository.save(professor);
    }



}
