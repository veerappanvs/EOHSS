package com.ehs.mihonline.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ehs.mihonline.dao.PersonRepository;
import com.ehs.mihonline.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository dao;

    @Override
    public Page<Person> findPaginated(int page, int size) {
        return dao.findAll(new PageRequest(page, size));
    }

}