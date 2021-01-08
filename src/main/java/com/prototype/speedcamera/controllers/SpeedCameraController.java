package com.prototype.speedcamera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prototype.speedcamera.dto.BreachedDto;
import com.prototype.speedcamera.dto.CameraGeneratorDto;
import com.prototype.speedcamera.entity.Camera;
import com.prototype.speedcamera.services.SpeedCameraServices;

@RestController
@RequestMapping("/speedCamera")
public class SpeedCameraController {

	@Autowired
	private SpeedCameraServices speedCameraServices;

	@GetMapping(value = "/hello")
	public String welcome() {
		return "Welcome Speed Camera System...";
	}

	@GetMapping(value = "/api/fetchSpeedCameraData", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CameraGeneratorDto> fetchSpeedCameraData() {
		return speedCameraServices.fetchSpeedCameraData();
	}

	@GetMapping(value = "/api/fetchCameraDataFromCentralServer", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Camera> fetchCameraDataFromCentralServer() {
		return speedCameraServices.fetchCameraDataFromCentralServer();
	}

	@GetMapping(value = "/api/fetchSpeedLimitBreached/{limit}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Camera> fetchSpeedLimitBreached(
			@PathVariable(value = "limit") int speedLimit) {
		return speedCameraServices.fetchSpeedLimitBreached(speedLimit);
	}

	@PostMapping(value = "/api/saveBreachedData", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveBreachedData(@RequestBody List<BreachedDto> breachedList) {
		speedCameraServices.saveBreachedData(breachedList);
	}
}
