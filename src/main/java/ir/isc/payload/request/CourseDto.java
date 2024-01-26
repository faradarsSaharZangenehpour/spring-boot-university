package ir.isc.payload.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;

public class CourseDto {

    @NotNull
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
