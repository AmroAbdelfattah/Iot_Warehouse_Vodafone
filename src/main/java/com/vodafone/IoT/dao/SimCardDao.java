package com.vodafone.IoT.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.vodafone.IoT.model.SimCard;


public interface SimCardDao extends JpaRepository<SimCard, Integer>{
    
	@Transactional
    @Modifying
	@Query(value = "update SimCard s set s.status=:status where s.id=:id")
	public void updateStatus(@Param("status") String status , @Param("id") long id);
	
	boolean existsById(long id);
}
