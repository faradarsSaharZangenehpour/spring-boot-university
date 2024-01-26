package ir.isc.service;

import ir.isc.model.Student;
import ir.isc.model.Student_Professor_Course;
import ir.isc.payload.request.StudentProfessorCourseDto;
import ir.isc.payload.response.MessageResponse;
import ir.isc.repository.ProfessorCourseRepository;
import ir.isc.repository.StudentProfessorCourseRepository;
import ir.isc.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentProfessorCourseServiceImpl implements StudentProfessorCourseService{

    @Autowired
    private StudentProfessorCourseRepository studentProfessorCourseRepository;

    @Autowired
    private ProfessorCourseRepository professorCourseRepository;

    @Autowired
    private StudentRepository studentRepository;
    @Override
    @Transactional
    public Student_Professor_Course createAssignment(StudentProfessorCourseDto studentProfessorCourseDto) {

            Student s = studentRepository.findByNationalCode(studentProfessorCourseDto.getNationalCode());
            if (studentProfessorCourseRepository.existsByProfessorCourseId(studentProfessorCourseDto.getProfessor_course_id()) && studentProfessorCourseRepository.existsByStudentId(s.getId())){
                return null;
            }
            return studentProfessorCourseRepository.save(new Student_Professor_Course(studentProfessorCourseDto.getProfessor_course_id(), s.getId()));

    }
}
