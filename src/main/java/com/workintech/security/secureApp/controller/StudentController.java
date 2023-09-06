package com.workintech.security.secureApp.controller;

import com.workintech.security.secureApp.entity.Student;
import com.workintech.security.secureApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable int id) {
        return studentService.findById(id);
    }

    @PostMapping("/")
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @PutMapping("/{id}")
    public Student save(@RequestBody Student student, @PathVariable int id) {
        Student existingStudent = findById(id);
        if (existingStudent != null) {
            student.setId(id);
            return studentService.save(student);
        }
        return null;
    }

    @DeleteMapping("/{tckn}")
    public Student delete(@PathVariable String tckn){
        return studentService.delete(tckn);
    }


}
