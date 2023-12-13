package de.hse.swt;

import java.util.ArrayList;
import java.util.Random;

public class Database {


	/**
	 * Database connectivity check.
	 * 
	 * @return true - if the database can be connected, false otherwise.
	 */
	public boolean checkConnectivity() {
		Random rand = new Random();
		int randInt = rand.nextInt(60);
		if (randInt < 40) {
			
			// Database connectivity
			return true;
		} else {
			
			// No connectivity
			return false;
		}
	}
	
	/**
	 * 
	 * @param query
	 * @return In this simple example an ArrayList containing only the person ID (in same cases null). 
	 */
	public ArrayList<String> queryPersonByName(String query) {
		
		Random rand = new Random();
		int randInt = rand.nextInt(60);
		if (randInt < 40) {
			
			// Person found in DB
			rand = new Random();
			randInt = rand.nextInt(1000);
			String personId = String.valueOf(randInt);
			ArrayList<String> result = new ArrayList<String>();
			result.add(personId);
			return result;
		} else {
			
			// Person not found in DB
			return null;
		}
	}
}
