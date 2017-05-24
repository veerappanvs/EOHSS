package com.ehs.mihonline.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.ehs.mihonline.dao.ApplicationsRepository;
import com.ehs.mihonline.entity.Applications;

@Service
public class ApplicationsServiceImpl implements ApplicationsService {

    @Autowired
    private ApplicationsRepository dao;

    @Override
    public Page<Applications> findPaginated(int page, int size) {
        return dao.findAll(new PageRequest(page, size, Direction.DESC, "appId"));
    }

}