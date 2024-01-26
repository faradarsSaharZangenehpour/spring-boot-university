package ir.isc.service;

import ir.isc.model.Professor;
import ir.isc.model.Student;
import ir.isc.payload.request.StudentDto;
import ir.isc.repository.ProductRepository;
import ir.isc.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student createStudent(StudentDto studentDto) {
        return
                studentRepository.save(new Student(studentDto.getNationalCode(), studentDto.getName(), studentDto.getFamily(), studentDto.getFatherName(),
                        studentDto.getAge(), studentDto.getTerm(), studentDto.getField()
                ));
    }
}
