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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
