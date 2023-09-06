package com.workintech.security.secureApp.service;

import com.workintech.security.secureApp.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(int id);
    Student save(Student student);
    Student delete(String tckn);
}
