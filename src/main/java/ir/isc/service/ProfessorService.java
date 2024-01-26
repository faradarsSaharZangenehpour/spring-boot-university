package ir.isc.service;

import ir.isc.model.Professor;
import ir.isc.payload.request.ProfessorDto;


public interface ProfessorService {

    Professor createProfessor(ProfessorDto professorDto);
}
