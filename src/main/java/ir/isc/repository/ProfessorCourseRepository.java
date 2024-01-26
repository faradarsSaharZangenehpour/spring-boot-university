package ir.isc.repository;

import ir.isc.model.Professor_Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorCourseRepository extends JpaRepository<Professor_Course, Long> {

    Boolean existsById(long professor_course_id);
}
