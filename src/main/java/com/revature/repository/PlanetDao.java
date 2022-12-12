package com.revature.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.models.Planet;

public class PlanetDao {
    
	public static Logger logger = LoggerFactory.getLogger(PlanetDao.class);


    public List<Planet> getAllPlanets() {
		logger.info("In getAllPlanets method");

		return null;
	}

	public Planet getPlanetByName(String owner, String planetName) {
		logger.info("In getPlanetByName method");

		return null;
	}

	public Planet getPlanetById(String username, int planetId) {
		logger.info("In getPlanetById method");

		return null;
	}

	public Planet createPlanet(String username, Planet p) {
		logger.info("In createPlanet method");

		return null;
	}

	public void deletePlanetById(int planetId) {
		logger.info("In deleteP{lanetById method");

	}
}
