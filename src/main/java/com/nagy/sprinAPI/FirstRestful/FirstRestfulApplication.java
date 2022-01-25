package com.nagy.sprinAPI.FirstRestful;

import com.nagy.sprinAPI.FirstRestful.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class FirstRestfulApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstRestfulApplication.class, args);
    }

}
