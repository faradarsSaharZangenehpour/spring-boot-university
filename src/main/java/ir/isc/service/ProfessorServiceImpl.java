package ir.isc.service;

import ir.isc.model.Professor;
import ir.isc.model.Student;
import ir.isc.payload.request.ProfessorDto;
import ir.isc.repository.ProfessorRepository;
import ir.isc.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorServiceImpl implements ProfessorService{

    @Autowired
    private ProfessorRepository professorRepository;
    @Override
    public Professor createProfessor(ProfessorDto professorDto) {

        return professorRepository.save(new Professor(professorDto.getNationalCode(), professorDto.getName(), professorDto.getFamily(), professorDto.getFatherName(),
                professorDto.getAge(), professorDto.isFullTime(), professorDto.getField()
                ));
    }



}
