package ir.isc.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "student", uniqueConstraints = {
        @UniqueConstraint(columnNames = "nationalCode")
})
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 10, max = 10)
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

    @Column(name = "term")
    private int term;

    @Column(name = "field")
    private String field;

    public Student(){

    }

    public Student(String nationalCode, String name, String family, String fatherName, int age, int term, String field){
        this.nationalCode = nationalCode;
        this.name = name;
        this.family = family;
        this.fatherName = fatherName;
        this.age = age;
        this.term = term;
        this.field = field;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
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

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
