package com.ehs.mihonline.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ehs.mihonline.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> 
{

}