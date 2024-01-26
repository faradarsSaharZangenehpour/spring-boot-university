package ir.isc.service;

import ir.isc.model.Student;
import ir.isc.payload.request.StudentDto;


public interface StudentService {

    Student createStudent(StudentDto studentDto);
}
