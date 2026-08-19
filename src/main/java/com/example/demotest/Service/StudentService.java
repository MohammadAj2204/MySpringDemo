package com.example.demotest.Service;

import com.example.demotest.Model.Student;
import com.example.demotest.StudentRepo.StudentRepoo;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepoo studentRepoo ;
    public StudentService( StudentRepoo studentRepoo){
        this.studentRepoo=studentRepoo;
    }

    public List<Student> getall(){
        return studentRepoo.findAll();
    }
public Student savestudent(Student student){
        return studentRepoo.save(student);
}

    public Student getStudentById(Integer id) {
        Optional<Student> student = studentRepoo.findById(id);
        return student.orElse(null);

}
public Student upadtestudent(int id ,Student updatestudent){
        Student student =studentRepoo.findById(id).orElse(null);
        if( student== null){
            return null;
        }
        student.setAge(updatestudent.getAge());
        student.setName(updatestudent.getName());
        return studentRepoo.save(student);
}

    public void deleteStudent(Integer id) {
        studentRepoo.deleteById(id);
    }

}
