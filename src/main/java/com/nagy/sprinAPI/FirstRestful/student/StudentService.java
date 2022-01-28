package com.nagy.sprinAPI.FirstRestful.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository repository;


    @Autowired
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getStudents() {
        return repository.findAll();
    }

    public void addNewStudent(Student student) {
        System.out.println(student);

        Optional<Student> studentByEmail = repository
                .findStudentByEmail(student.getEmail());
        if (studentByEmail.isPresent()) {

            throw new IllegalStateException("email all ready exist !! ");
        }
         repository.save(student);
    }

    public void deleteStudent(Long studentID) {
        boolean exists = repository.existsById(studentID);
        if (!exists)
        {
            throw new IllegalStateException("student with id " + studentID +" does not exist ");
        }
        repository.deleteById(studentID);

    }
}
