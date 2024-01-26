package ir.isc.payload.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;

public class ProfessorDto {

    @NotNull
    private String name;

    @NotNull
    private String family;


    private String fatherName;


    private int age;

    @NotNull
    private boolean fullTime;

    @NotNull
    private String field;

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
}
