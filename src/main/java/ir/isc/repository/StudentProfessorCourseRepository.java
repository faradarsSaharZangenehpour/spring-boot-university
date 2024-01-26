package ir.isc.repository;

import ir.isc.model.Course;
import ir.isc.model.Professor;
import ir.isc.model.Student_Professor_Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentProfessorCourseRepository extends JpaRepository<Student_Professor_Course, Long> {

    Boolean existsByProfessorCourseId(long professor_course_id);

    Boolean existsByStudentId(long studentId);

}
