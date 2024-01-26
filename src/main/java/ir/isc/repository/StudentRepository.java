package ir.isc.repository;

import ir.isc.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Boolean existsByNationalCode(String nationalCode);
    Student findByNationalCode(String nationalCode);
}
