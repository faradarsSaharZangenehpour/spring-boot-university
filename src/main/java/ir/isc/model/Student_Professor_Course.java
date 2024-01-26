package ir.isc.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student_professor_course")
public class Student_Professor_Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "professorCourseId")
    private long professorCourseId;

    @Column(name = "studentId")
    private long studentId;

    public Student_Professor_Course(){

    }

    public Student_Professor_Course(long professor_course_id, long student_id){
        this.professorCourseId = professor_course_id;
        this.studentId = student_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProfessorCourseId() {
        return professorCourseId;
    }

    public void setProfessorCourseId(long professorCourseId) {
        this.professorCourseId = professorCourseId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }
}
