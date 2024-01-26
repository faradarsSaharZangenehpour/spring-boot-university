package ir.isc.service;

import ir.isc.model.Course;
import ir.isc.payload.request.CourseDto;

public interface CourseService {
	Course createCourse(CourseDto courseDto);

}
