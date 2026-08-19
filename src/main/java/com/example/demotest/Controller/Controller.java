package com.example.demotest.Controller;
import com.example.demotest.Model.Student;
import com.example.demotest.Service.StudentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class Controller {

    private final StudentService studentService;

    public Controller(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/hello")
    public String hello() {
        return " Hello world";
    }

    @PostMapping("/addstudent")
    public Student addstud(@RequestBody Student student) {
        return studentService.savestudent(student);
    }

    @GetMapping("/getall")
    public List<Student> getall() {
        return studentService.getall();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return studentService.getStudentById(id);
    }

    @PutMapping("/student/{id}")
    public Student updatestudent(@PathVariable Integer id, @RequestBody Student student){
        return studentService.upadtestudent(id,student);
}
@DeleteMapping("/student/{id}")
    public String deletestudent(@PathVariable Integer id ){
        studentService.deleteStudent(id);
        return "Student Deleted Successfully "+ id;
}


}
