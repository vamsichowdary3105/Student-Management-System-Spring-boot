package com.StudentManagementSystem.service;

import java.util.List;

import com.StudentManagementSystem.model.student;

public interface StudentService {
	List<student> getAllStudents();
    student saveStudent(student student);
    student getStudentById(Long id);
    void deleteStudentById(Long id);

}
