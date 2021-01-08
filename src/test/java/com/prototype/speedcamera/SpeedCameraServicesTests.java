package com.prototype.speedcamera;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.prototype.speedcamera.dao.SpeedCameraDao;
import com.prototype.speedcamera.entity.Camera;
import com.prototype.speedcamera.services.SpeedCameraServices;


@SpringBootTest(classes = SpeedCameraApplication.class)
public class SpeedCameraServicesTests {

	@Mock
	private SpeedCameraDao speedCameraDao;

	@InjectMocks
	private SpeedCameraServices speedCameraServices;

	@Test
	public void fetchSpeedLimitBreached() {
		List<Camera> cameraMockDatalist = getMockedData();

		when(speedCameraDao.findSpeedLimitBreached(60)).thenReturn(cameraMockDatalist);

		List<Camera> cameraDataList = speedCameraServices.fetchSpeedLimitBreached(60);

		assertThat(cameraDataList).isNotEmpty();
		assertEquals(cameraDataList.get(0).getVehicleSpeed(), 80);
	}

	private List<Camera> getMockedData() {
		List<Camera> cameraMockDatalist = new ArrayList<>();

		Camera obj = new Camera();
		obj.setId(1);
		obj.setCameraSno("11");
		obj.setCameraType("C11");
		obj.setLatitude("1111");
		obj.setLongitude("1111");
		obj.setTravelTime("12:12:2020 08:30:30");
		obj.setVehicleNo("MU1111");
		obj.setVehicleSpeed(80);
		cameraMockDatalist.add(obj);

		return cameraMockDatalist;
	}
}
