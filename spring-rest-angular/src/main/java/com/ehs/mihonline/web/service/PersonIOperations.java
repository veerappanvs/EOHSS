package com.ehs.mihonline.web.service;

import org.springframework.data.domain.Page;

import com.ehs.mihonline.entity.Applications;
import com.ehs.mihonline.entity.Person;
import com.ehs.mihonline.entity.Student;

public interface PersonIOperations<T> {

    public Page<Person> findPaginated(final int page, final int size);

}