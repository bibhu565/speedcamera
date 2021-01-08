package com.prototype.speedcamera.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "BREACHED")
public class Breached implements Serializable {

	private static final long serialVersionUID = 2L;

	@Id
    @GeneratedValue
	private Integer id;
	
	@NotNull
	private String vehicleType;
	
	@NotNull
	private String location;
	
	@NotNull
	private String travelTime;
	
	@NotNull
	private String vehicleNo;
	
	@NotNull
	private Integer vehicleSpeed;
	
	@NotNull
	private Integer allowedSpeed;
}
