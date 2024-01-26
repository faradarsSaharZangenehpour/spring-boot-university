package ir.isc.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "professor",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "nationalCode")
        })
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=10, max =10)
    @Column(name = "nationalCode")
    private String nationalCode;
    @Column(name = "name")
    private String name;

    @Column(name = "family")
    private String family;

    @Column(name = "fatherName")
    private String fatherName;

    @Column(name = "age")
    private int age;

    @Column(name = "fullTime")
    private boolean fullTime;

    @Column(name = "field")
    private String field;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(	name = "professor_course",
            joinColumns = @JoinColumn(name = "professor_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private Set<Course> courses = new HashSet<>();

    public  Professor(){

    }

    public Professor(String nationalCode, String name, String family, String fatherName, int age, boolean fullTime, String field, Set<Course> courses){
        this.nationalCode = nationalCode;
        this.name = name;
        this.family = family;
        this.fatherName = fatherName;
        this.age = age;
        this.fullTime = fullTime;
        this.field = field;
        this.courses = courses;
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

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
