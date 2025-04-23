package com.microservice.student.persistence;

import com.microservice.student.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository <Student, Long> {


    List<Student> findAllByIdCourse(Long idCourse);

    List<Student> findAllStudent(Long idCourse);
}
