package com.vodafone.IoT.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vodafone.IoT.dao.SimCardDao;
import com.vodafone.IoT.service.SimCardService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class SimCardController {

	private final SimCardService simCardService;
	private final SimCardDao simCardDao;

	@PatchMapping("/activate/{id}")
	public ResponseEntity<Object> activate(@PathVariable int id) {
		try {
			if (simCardDao.existsById(id)) {
				simCardService.changeStatus("active", id);
				return new ResponseEntity<>(HttpStatus.OK);
			}
			else
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);

		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@PatchMapping("/wait-for-activate/{id}")
	public ResponseEntity<Object> waitForActivate(@PathVariable int id) {
		try {
			if (simCardDao.existsById(id)) {
				simCardService.changeStatus("waiting for activation", id);
				return new ResponseEntity<>(HttpStatus.OK);
			}
			else
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);

		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@PatchMapping("/block/{id}")
	public ResponseEntity<Object> block(@PathVariable int id) {
		try {
			if (simCardDao.existsById(id)) {
				simCardService.changeStatus("block", id);
				return new ResponseEntity<>(HttpStatus.OK);
			}
			else
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);

		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@PatchMapping("/deactivate/{id}")
	public ResponseEntity<Object> deActivate(@PathVariable int id) {
		try {
			if (simCardDao.existsById(id)) {
				simCardService.changeStatus("deactivated", id);
				return new ResponseEntity<>(HttpStatus.OK);
			}
			else
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);

		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}
