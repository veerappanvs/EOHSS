package com.ehs.mihonline.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ehs.mihonline.entity.Ambulance;

/**
 * @author vsubramaniyan
 *
 */
@Repository
public interface AmbulanceRepository extends JpaRepository<Ambulance, Integer>{
}

