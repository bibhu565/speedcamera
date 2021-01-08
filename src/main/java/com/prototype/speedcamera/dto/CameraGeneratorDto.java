package com.prototype.speedcamera.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CameraGeneratorDto {

	private Integer id;
	private String cameraSno;
	private String cameraType;
	private String latitude;
	private String longitude;
	private String travelTime;
	private String vehicleNo;
	private Integer vehicleSpeed;

	public CameraGeneratorDto(Integer id, String cameraSno, String cameraType, String latitude, String longitude,
			String travelTime, String vehicleNo, Integer vehicleSpeed) {
		this.id = id;
		this.cameraSno = cameraSno;
		this.cameraType = cameraType;
		this.latitude = latitude;
		this.longitude = longitude;
		this.travelTime = travelTime;
		this.vehicleNo = vehicleNo;
		this.vehicleSpeed = vehicleSpeed;
	}

	@Override
	public String toString() {
		return "CameraGeneratorDto [id=" + id + ", cameraSno=" + cameraSno + ", cameraType=" + cameraType
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", travelTime=" + travelTime + ", vehicleNo="
				+ vehicleNo + ", vehicleSpeed=" + vehicleSpeed + "]";
	}
}
