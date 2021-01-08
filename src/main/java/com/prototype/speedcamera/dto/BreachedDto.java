package com.prototype.speedcamera.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BreachedDto {

	private Integer id;
	private String vehicleType;
	private String location;
	private String travelTime;
	private String vehicleNo;
	private Integer vehicleSpeed;
	private Integer allowedSpeed;

	@Override
	public String toString() {
		return "BreachedDto [id=" + id + ", vehicleType=" + vehicleType
				+ ", location=" + location + ", travelTime=" + travelTime
				+ ", vehicleNo=" + vehicleNo + ", vehicleSpeed=" + vehicleSpeed
				+ ", allowedSpeed=" + allowedSpeed + "]";
	}
}
