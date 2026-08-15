package com.example.demotest.StudentRepo;

import com.example.demotest.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepoo extends JpaRepository<Student,Integer> {


}
