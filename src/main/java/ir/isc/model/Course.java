package ir.isc.model;

import jakarta.persistence.*;

@Entity
@Table(name = "course", uniqueConstraints = {
        @UniqueConstraint(columnNames = "name")
})
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    public Course(){
    }
    public Course(String name){
        this.name = name;
    }

}
