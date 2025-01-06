package com.StudentManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentManagementSystem.model.student;
import com.StudentManagementSystem.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
    private StudentRepository studentRepository;

    @Override
    public List<student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public student saveStudent(student student) {
        return studentRepository.save(student);
    }

    @Override
    public student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

}
