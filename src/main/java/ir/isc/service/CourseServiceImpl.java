package ir.isc.service;

import ir.isc.model.Course;
import ir.isc.payload.request.CourseDto;
import ir.isc.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService{

	
	@Autowired
	private CourseRepository courseRepository;


	@Override
	public Course createCourse(CourseDto courseDto) {
		return courseRepository.save(new Course(courseDto.getName()));
	}
}
