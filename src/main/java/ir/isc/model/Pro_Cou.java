package ir.isc.model;

import jakarta.persistence.*;

@Entity
@Table(name = "professor_course")
public class Pro_Cou {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

}
