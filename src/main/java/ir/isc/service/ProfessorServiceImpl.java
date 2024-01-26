package ir.isc.service;

import ir.isc.model.Course;
import ir.isc.model.Professor;
import ir.isc.model.Student;
import ir.isc.payload.request.ProfessorDto;
import ir.isc.payload.response.MessageResponse;
import ir.isc.repository.CourseRepository;
import ir.isc.repository.ProfessorRepository;
import ir.isc.repository.StudentRepository;
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

    @Override
    public Professor createProfessor(ProfessorDto professorDto) {
        Set<String> strCourses = professorDto.getCourses();
        Set<Course> courses = new HashSet<>();

        if (professorDto.getCourses() == null || professorDto.getCourses().isEmpty()) {
            return null;
        } else {
            strCourses.forEach(c -> {
                Course course = courseRepository.findByName(c);
                // .orElseThrow(() -> new RuntimeException("Error: Course is not found."));
                courses.add(course) ;
            });
        }

        return professorRepository.save(new Professor(professorDto.getNationalCode(), professorDto.getName(), professorDto.getFamily(), professorDto.getFatherName(),
                professorDto.getAge(), professorDto.isFullTime(), professorDto.getField(), courses
                ));
    }



}
