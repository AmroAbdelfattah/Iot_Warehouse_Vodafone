package com.vodafone.IoT.service;


import org.springframework.stereotype.Service;


import com.vodafone.IoT.dao.SimCardDao;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SimCardService {

	
	private final SimCardDao simCardDao;
	public void changeStatus(String status,int id) {
		simCardDao.updateStatus(status,id);
	}
}
