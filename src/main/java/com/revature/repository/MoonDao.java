package com.revature.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.models.Moon;

public class MoonDao {

	public static Logger logger = LoggerFactory.getLogger(MoonDao.class);
    
    public List<Moon> getAllMoons() {
		logger.info("In getAllMoons method.");
		return null;
	}

	public Moon getMoonByName(String username, String moonName) {
		logger.info("In getMoonByName method.");	
		return null;
	}

	public Moon getMoonById(String username, int moonId) {
		logger.info("In getMoonById method.");
		
		return null;
	}

	public Moon createMoon(String username, Moon m) {
		logger.info("In createMoon method.");
		return null;
	}

	public void deleteMoonById(int moonId) {
		logger.info("In deleteMoonById method.");

	}

	public List<Moon> getMoonsFromPlanet(int planetId) {
		logger.info("In getMoonsFromPlanet method.");
		return null;
	}
}
