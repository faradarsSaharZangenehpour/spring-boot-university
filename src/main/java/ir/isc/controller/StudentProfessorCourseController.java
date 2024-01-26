package ir.isc.controller;

import ir.isc.model.Student_Professor_Course;
import ir.isc.payload.request.CourseDto;
import ir.isc.payload.request.StudentProfessorCourseDto;
import ir.isc.payload.response.MessageResponse;
import ir.isc.repository.ProfessorCourseRepository;
import ir.isc.repository.StudentRepository;
import ir.isc.service.CourseService;
import ir.isc.service.StudentProfessorCourseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentProfessorCourseController {

    @Autowired
    private StudentProfessorCourseService studentProfessorCourseService;

    @Autowired
    private ProfessorCourseRepository professorCourseRepository;

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/assign_student_professor")
    public ResponseEntity<?> createAssignment(@Valid @RequestBody StudentProfessorCourseDto studentProfessorCourseDto){
        //return ResponseEntity.ok().body(this.courseService.createCourse(courseDto));
        if (!studentRepository.existsByNationalCode(studentProfessorCourseDto.getNationalCode())) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: Student is not registered!"));
        } else if (!professorCourseRepository.existsById(studentProfessorCourseDto.getProfessor_course_id())) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: Professor_Course_Id is not registered!"));
        }
        Student_Professor_Course s =this.studentProfessorCourseService.createAssignment(studentProfessorCourseDto);
        if(s == null){
            return ResponseEntity.badRequest().body(new MessageResponse("Error: This assignment has been defined!"));
        }
        return ResponseEntity.ok(new MessageResponse("Course Assignment Created successfully!"));
    }
}
