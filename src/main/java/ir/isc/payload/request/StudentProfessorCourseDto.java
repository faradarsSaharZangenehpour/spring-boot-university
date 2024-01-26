package ir.isc.payload.request;

public class StudentProfessorCourseDto {

    private long professor_course_id;
    private String nationalCode;

    public long getProfessor_course_id() {
        return professor_course_id;
    }

    public void setProfessor_course_id(long professor_course_id) {
        this.professor_course_id = professor_course_id;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }
}
