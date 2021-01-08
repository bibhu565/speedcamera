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
@Table(name = "CAMERA")
public class Camera implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
	private Integer id;
	
	@NotNull
	private String cameraSno;
	
	@NotNull
	private String cameraType;
	
	@NotNull
	private String latitude;
	
	@NotNull
	private String longitude;
	
	@NotNull
	private String travelTime;
	
	@NotNull
	private String vehicleNo;
	
	@NotNull
	private Integer vehicleSpeed;
}
