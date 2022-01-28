package com.nagy.sprinAPI.FirstRestful.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {


    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student nagy = new Student("ahmed nagy",
                    "a.nagy@example.com"
                    , LocalDate.of(
                    1994,
                    MAY,
                    1));

            Student rihanna = new Student("rihanna",
                    "rihanna@example.com"
                    , LocalDate.of(
                    1980,
                    JULY,
                    13));

            repository.saveAll(List.of(nagy,rihanna));

        };
    }
}
