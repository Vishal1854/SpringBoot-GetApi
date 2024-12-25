package com.springrest.Springrest.service;

import com.springrest.Springrest.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class courseServiceImpl implements courseService{

    List<Course> list;

    public courseServiceImpl(){
        list=new ArrayList<>();
        list.add(new Course(1,"Java","All About Java",5000));
        list.add(new Course(2,"Angular","All About Angular",6000));
        list.add(new Course(3,"SpringBoot","All About SpringBoot",3000));
        list.add(new Course(5,"Html","All About Html",2000));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }
}
