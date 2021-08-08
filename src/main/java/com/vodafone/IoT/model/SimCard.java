package com.vodafone.IoT.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int operatorCode;
	private String country;
	private String status;
}
