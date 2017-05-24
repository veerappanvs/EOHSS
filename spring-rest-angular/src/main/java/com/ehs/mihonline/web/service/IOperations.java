package com.ehs.mihonline.web.service;

import org.springframework.data.domain.Page;

import com.ehs.mihonline.entity.Applications;
import com.ehs.mihonline.entity.Student;

public interface IOperations<T> {

    public Page<Student> findPaginated(final int page, final int size);

}