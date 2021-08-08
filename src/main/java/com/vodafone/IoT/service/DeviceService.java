package com.vodafone.IoT.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vodafone.IoT.dao.DeviceDao;
import com.vodafone.IoT.model.Device;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DeviceService {

	
	private final DeviceDao deviceDao;
	public List<Device> findAllDevices() {
		return deviceDao.findAll();
	}
	public List<Device> findWaitingActivation() {
		return deviceDao.findWaitingActivation();
	}
	public List<Device> findReadyForSale() {
		return deviceDao.findReadyForSale();
	}
}
