package ir.isc.service;

import ir.isc.model.Student_Professor_Course;
import ir.isc.payload.request.StudentProfessorCourseDto;
import org.springframework.http.ResponseEntity;

public interface StudentProfessorCourseService{
    public Student_Professor_Course createAssignment(StudentProfessorCourseDto studentProfessorCourseDto);
}
