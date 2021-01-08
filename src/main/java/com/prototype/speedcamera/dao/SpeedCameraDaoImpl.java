package com.prototype.speedcamera.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.prototype.speedcamera.entity.Breached;
import com.prototype.speedcamera.entity.Camera;

@Repository
public class SpeedCameraDaoImpl implements SpeedCameraDao {

	@PersistenceContext
	private EntityManager em;

	public List<Camera> findAll() {

		return em.createQuery("from Camera", Camera.class).getResultList();
	}

	public List<Camera> findSpeedLimitBreached(int speedLimit) {

		TypedQuery<Camera> q = em.createQuery("from Camera WHERE vehicleSpeed > :speedLimit", Camera.class);
		q.setParameter("speedLimit", speedLimit);
		return q.getResultList();
	}

	public void saveBreachedData(Breached model) {

		if (null == model.getId()) {
			em.persist(model);
		} else {
			em.merge(model);
		}
	}
}
