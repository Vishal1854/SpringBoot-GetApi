package com.springrest.Springrest.Controller;
import com.springrest.Springrest.entities.Course;
import com.springrest.Springrest.service.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {
    @Autowired
    private courseService CourseService;

    @GetMapping("/home")
    public String home() {
        return "WELCOME HOME!";
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.CourseService.getCourses();
    }
}
