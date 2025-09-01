package com.example.university.Controller;

import com.example.university.model.Course;
import com.example.university.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    @Autowired
    private CourseRepository repo;

    // Get all courses
    @GetMapping
    public List<Course> getAllCourses() { 
        return repo.findAll(); 
    }

    // Add a new course
    @PostMapping
    public Course addCourse(@RequestBody Course course) { 
        return repo.save(course); 
    }
}
