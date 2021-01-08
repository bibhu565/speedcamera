DROP TABLE IF EXISTS CAMERA;

CREATE TABLE CAMERA (
  id INTEGER AUTO_INCREMENT PRIMARY KEY,
  camera_Sno VARCHAR(250) NOT NULL,
  camera_Type VARCHAR(250) NOT NULL,
  latitude VARCHAR(250) NOT NULL,
  longitude VARCHAR(250) NOT NULL,
  travel_Time VARCHAR(250) NOT NULL,
  vehicle_No VARCHAR(250) NOT NULL,
  vehicle_Speed INTEGER NOT NULL
);

DROP TABLE IF EXISTS BREACHED;

CREATE TABLE BREACHED (
  id INTEGER AUTO_INCREMENT PRIMARY KEY,
  vehicle_Type VARCHAR(250) NOT NULL,
  location VARCHAR(250) NOT NULL,
  travel_Time VARCHAR(250) NOT NULL,
  vehicle_No VARCHAR(250) NOT NULL,
  vehicle_Speed INTEGER NOT NULL,
  allowed_Speed INTEGER NOT NULL
);

INSERT INTO CAMERA (camera_Sno, camera_Type, latitude, longitude, travel_Time, vehicle_No, vehicle_Speed) VALUES
	('11', 'C11', '1111', '1111', '12:12:2020 09:30:00', 'MU1111', 60);
INSERT INTO CAMERA (camera_Sno, camera_Type, latitude, longitude, travel_Time, vehicle_No, vehicle_Speed) VALUES
	('22', 'C22', '2222', '2222', '12:12:2020 10:30:00', 'MU2222', 100);
INSERT INTO CAMERA (camera_Sno, camera_Type, latitude, longitude, travel_Time, vehicle_No, vehicle_Speed) VALUES
    ('33', 'C33', '3333', '3333', '12:12:2020 11:30:00', 'MU3333', 120);
INSERT INTO CAMERA (camera_Sno, camera_Type, latitude, longitude, travel_Time, vehicle_No, vehicle_Speed) VALUES
    ('44', 'C44', '4444', '4444', '12:12:2020 12:30:00', 'MU4444', 90);
INSERT INTO CAMERA (camera_Sno, camera_Type, latitude, longitude, travel_Time, vehicle_No, vehicle_Speed) VALUES
    ('55', 'C55', '5555', '5555', '12:12:2020 15:30:00', 'MU5555', 110);