package com.ehs.mihonline.web.service;

import org.springframework.data.domain.Page;

import com.ehs.mihonline.entity.Applications;

public interface ApplicationsIOperations<T> {

    public Page<Applications> findPaginated(final int page, final int size);

}