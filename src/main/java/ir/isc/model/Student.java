package ir.isc.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "family")
    private String family;

    @Column(name = "fatherName")
    private String fatherName;

    @Column(name = "age")
    private int age;

    @Column(name = "term")
    private int term;

    @Column(name = "field")
    private String field;

}
