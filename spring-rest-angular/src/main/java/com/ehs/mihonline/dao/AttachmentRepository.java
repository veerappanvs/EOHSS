/**
 * 
 */
package com.ehs.mihonline.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ehs.mihonline.entity.Attachment;

/**
 * @author vsubramaniyan
 *
 */
@Repository
public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {

}
