package com.prototype.speedcamera.dao;

import java.util.List;

import com.prototype.speedcamera.entity.Breached;
import com.prototype.speedcamera.entity.Camera;

public interface SpeedCameraDao {

	public List<Camera> findAll();
	
	public List<Camera> findSpeedLimitBreached(int speedLimit);
	
	public void saveBreachedData(Breached model);
}
