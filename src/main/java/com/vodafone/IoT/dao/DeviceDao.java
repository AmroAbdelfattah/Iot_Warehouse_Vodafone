package com.vodafone.IoT.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vodafone.IoT.model.Device;

public interface DeviceDao extends JpaRepository<Device, Integer>{

	@Query(nativeQuery = true, value = "select * from device d inner join sim_card s on d.sim_id = s.id where s.status='waiting for activation'")
	public List<Device> findWaitingActivation();
	
	@Query(nativeQuery = true, value = "select * from device where status='ready' and temp between '-25' and '85'")
	public List<Device> findReadyForSale();
}
