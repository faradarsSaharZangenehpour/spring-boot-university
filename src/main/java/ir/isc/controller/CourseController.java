package ir.isc.controller;

import ir.isc.model.Course;
import ir.isc.model.Student;
import ir.isc.service.CourseService;
import ir.isc.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CourseController {

    private CourseService courseService;

    @PostMapping("/create-Course")
    public ResponseEntity<Course> createCourse(@RequestBody Course course){
        return ResponseEntity.ok().body(this.courseService.createCourse(course));
    }
}
