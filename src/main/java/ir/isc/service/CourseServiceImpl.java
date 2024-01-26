package ir.isc.service;

import ir.isc.exception.ResourceNotFoundException;
import ir.isc.model.Course;
import ir.isc.model.Product;
import ir.isc.repository.CourseRepository;
import ir.isc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{

	
	@Autowired
	private CourseRepository courseRepository;


	@Override
	public Course createCourse(Course course) {
		return courseRepository.save(course);
	}
}
