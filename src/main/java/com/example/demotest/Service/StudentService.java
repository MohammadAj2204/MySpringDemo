package com.example.demotest.Service;

import com.example.demotest.Model.Student;
import com.example.demotest.StudentRepo.StudentRepoo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepoo studentRepoo;
    public StudentService( StudentRepoo studentRepoo){
        this.studentRepoo=studentRepoo;
    }

    public List<Student> getall(){
        return studentRepoo.findAll();
    }
public Student savestudent(Student student){
        return studentRepoo.save(student);

}


}
