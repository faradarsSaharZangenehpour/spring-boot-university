package ir.isc.service;

import ir.isc.model.Course;
import ir.isc.model.Product;
import ir.isc.payload.request.CourseDto;

import java.util.List;

public interface CourseService {
	Course createCourse(CourseDto courseDto);

}
