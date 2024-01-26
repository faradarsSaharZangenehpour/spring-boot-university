package ir.isc.service;

import ir.isc.model.Product;
import ir.isc.model.Student;
import ir.isc.payload.request.StudentDto;
import org.springframework.stereotype.Service;


public interface StudentService {

    Student createStudent(Student student);
}
