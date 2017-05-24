package com.ehs.mihonline.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ehs.mihonline.entity.Applications;
import com.ehs.mihonline.web.exception.MyResourceNotFoundException;
import com.ehs.mihonline.web.service.ApplicationsService;

@RestController
public class ApplicationsListRestController {

    @Autowired
    private ApplicationsService service;

    @RequestMapping(value = "/applications/get", params = { "page", "size" }, method = RequestMethod.GET, produces = "application/json")
    public Page<Applications> findPaginated(@RequestParam("page") int page, @RequestParam("size") int size) {

        Page<Applications> resultPage = service.findPaginated(page, size);
        if (page > resultPage.getTotalPages()) {
            throw new MyResourceNotFoundException();
        }
        System.out.println("resultPage ==================> "+resultPage.getContent());
        return resultPage;
    }
    
 

}