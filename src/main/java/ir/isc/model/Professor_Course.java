package ir.isc.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Professor_Course")

public class Professor_Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "professor_id")
    private long professor_id;

    @Column(name = "course_id")
    private long course_id;

    public Professor_Course(){
    }
    public Professor_Course(long professor_id, long course_id){
        this.professor_id = professor_id;
        this.course_id = course_id;
    }

}
