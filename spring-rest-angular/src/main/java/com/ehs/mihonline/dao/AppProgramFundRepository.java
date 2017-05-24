package com.ehs.mihonline.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ehs.mihonline.entity.AppProgramFund;


/**
 * @author vsubramaniyan
 *
 */
@Repository
public interface AppProgramFundRepository extends JpaRepository<AppProgramFund, Integer>{
}

