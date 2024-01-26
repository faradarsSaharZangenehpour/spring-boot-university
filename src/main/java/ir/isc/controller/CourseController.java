package ir.isc.controller;

import ir.isc.model.Course;
import ir.isc.model.Student;
import ir.isc.payload.request.CourseDto;
import ir.isc.payload.response.MessageResponse;
import ir.isc.service.CourseService;
import ir.isc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/create-course")
    public ResponseEntity<?> createCourse(@Valid @RequestBody CourseDto courseDto){
        //return ResponseEntity.ok().body(this.courseService.createCourse(courseDto));
        this.courseService.createCourse(courseDto);
        return ResponseEntity.ok(new MessageResponse("Course registered successfully!"));
    }
}
