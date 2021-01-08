package com.prototype.speedcamera.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prototype.speedcamera.dao.SpeedCameraDao;
import com.prototype.speedcamera.dto.BreachedDto;
import com.prototype.speedcamera.dto.CameraGeneratorDto;
import com.prototype.speedcamera.entity.Breached;
import com.prototype.speedcamera.entity.Camera;

@Service
public class SpeedCameraServices {

	@Autowired
	private SpeedCameraDao speedCameraDao;
	
	public List<CameraGeneratorDto> fetchSpeedCameraData() {
		List<CameraGeneratorDto> employeeList = new ArrayList<>();
		employeeList.add(new CameraGeneratorDto(1, "11", "C11", "1111", "1111", "12:12:2020 09:30:00", "MU1111", 60));
		employeeList.add(new CameraGeneratorDto(2, "22", "C22", "2222", "2222", "12:12:2020 10:30:00", "MU2222", 100));
		employeeList.add(new CameraGeneratorDto(3, "33", "C33", "3333", "3333", "12:12:2020 11:30:00", "MU3333", 120));
		employeeList.add(new CameraGeneratorDto(4, "44", "C44", "4444", "4444", "12:12:2020 12:30:00", "MU4444", 90));
		employeeList.add(new CameraGeneratorDto(5, "55", "C55", "5555", "5555", "12:12:2020 15:30:00", "MU5555", 110));
		
		return employeeList;
    }
	
	public List<Camera> fetchCameraDataFromCentralServer() {
		return speedCameraDao.findAll();
	}
	
	public List<Camera> fetchSpeedLimitBreached(int speedLimit) {
		return speedCameraDao.findSpeedLimitBreached(speedLimit);
	}
	
	@Transactional
	public void saveBreachedData(List<BreachedDto> breachedList) {
		for(BreachedDto object: breachedList) {
			Breached breached = new Breached();
			breached.setVehicleType(object.getVehicleType());
			breached.setLocation(object.getLocation());
			breached.setTravelTime(object.getTravelTime());
			breached.setVehicleNo(object.getVehicleNo());
			breached.setVehicleSpeed(object.getVehicleSpeed());
			breached.setAllowedSpeed(object.getAllowedSpeed());
			speedCameraDao.saveBreachedData(breached);
        }
	}
}
