package com.vodafone.IoT.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vodafone.IoT.model.Device;
import com.vodafone.IoT.service.DeviceService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class DeviceController {

	private final DeviceService deviceService;
	
    @GetMapping("/all")
	public List<Device> findAllDevices(){
		return deviceService.findAllDevices();
	}
	
    @GetMapping("/wating-for-activation")
	public List<Device> findWaitingDevices(){
		return deviceService.findWaitingActivation();
	}
	
    @GetMapping("/ready-for-sale")
	public List<Device> findReadyForSale(){
		return deviceService.findReadyForSale();
	}
	
}
