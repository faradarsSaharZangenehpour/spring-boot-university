package ir.isc.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student_professor_course")
public class Stu_Pro_Cou {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
