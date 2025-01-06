package com.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentManagementSystem.model.student;

public interface StudentRepository extends JpaRepository<student,Long>{

}
