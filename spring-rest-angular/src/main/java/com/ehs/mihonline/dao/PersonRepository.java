package com.ehs.mihonline.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ehs.mihonline.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> 
{

}