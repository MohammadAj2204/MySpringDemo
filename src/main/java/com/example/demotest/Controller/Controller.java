package com.example.demotest.Controller;

import com.example.demotest.Model.Student;
import com.example.demotest.Service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    private final StudentService studentService;
    public Controller(StudentService studentService){
        this.studentService=studentService;
    }
    @GetMapping("/hello")
    public String hello(){
     return " Hello world";
    }
    @PostMapping("/addstudent")
    public Student addstud(@RequestBody Student student ) {
        return studentService.savestudent(student);
    }
    @GetMapping("/getall")
    public List<Student> getall(){
        return studentService.getall();
    }


}
