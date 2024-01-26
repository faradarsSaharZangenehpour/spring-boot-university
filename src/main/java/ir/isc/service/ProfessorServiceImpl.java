package ir.isc.service;

import ir.isc.model.Course;
import ir.isc.model.Professor;
import ir.isc.model.Professor_Course;
import ir.isc.model.Student;
import ir.isc.payload.request.ProfessorDto;
import ir.isc.payload.response.MessageResponse;
import ir.isc.repository.CourseRepository;
import ir.isc.repository.ProfessorCourseRepository;
import ir.isc.repository.ProfessorRepository;
import ir.isc.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ProfessorServiceImpl implements ProfessorService{

    @Autowired
    private ProfessorRepository professorRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private ProfessorCourseRepository professorCourseRepository;

    @Override
    @Transactional
    public Professor createProfessor(ProfessorDto professorDto) {
        Set<String> strCourses = professorDto.getCourses();

        if (professorDto.getCourses() == null || professorDto.getCourses().isEmpty()) {
            return null;
        } else {
            Professor p = professorRepository.save(new Professor(professorDto.getNationalCode(), professorDto.getName(), professorDto.getFamily(), professorDto.getFatherName(),
                    professorDto.getAge(), professorDto.isFullTime(), professorDto.getField()
            ));
            strCourses.forEach(c -> {
                Course course = courseRepository.findByName(c);
                // .orElseThrow(() -> new RuntimeException("Error: Course is not found."));
                professorCourseRepository.save(new Professor_Course(p.getId(), course.getId()));
            });
            return p;
        }

    }

}
