package com.ehs.mihonline.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ehs.mihonline.entity.Person;
import com.ehs.mihonline.web.exception.MyResourceNotFoundException;
import com.ehs.mihonline.web.service.PersonService;

@RestController
public class StudentDirectoryRestController {

    @Autowired
    private PersonService service;

    @RequestMapping(value = "/person/get", params = { "page", "size" }, method = RequestMethod.GET, produces = "application/json")
    public Page<Person> findPaginated(@RequestParam("page") int page, @RequestParam("size") int size) {

        Page<Person> resultPage = service.findPaginated(page, size);
        if (page > resultPage.getTotalPages()) {
            throw new MyResourceNotFoundException();
        }
        return resultPage;
    }

}