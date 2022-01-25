package com.nagy.sprinAPI.FirstRestful.student;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(new Student(5L,"ahmed nagy",
                "a.nagy@example.com"
                , LocalDate.of(
                1994,
                Month.MAY,
                1) ,28));
    }

}
