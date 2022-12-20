package com.project.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.sms.entity.Student;

public interface IStudentRepository extends JpaRepository<Student, Long>{

}
