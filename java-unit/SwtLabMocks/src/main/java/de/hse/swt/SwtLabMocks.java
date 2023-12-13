package de.hse.swt;

import java.util.ArrayList;

public class SwtLabMocks {

	private Database db;

	/**
	 * Creates a new SwtLab06Task3 object.
	 * 
	 * @param db - the database to use
	 */
	public SwtLabMocks(Database db) {
		this.db = db;
	}

	/**
	 * Searches for a person given by its name in the database.
	 * 
	 * @param name - name of the person to search
	 * @return an object of class Person in case the person was found<BR />
	 *         null - if the person is not found or there is no database connectivity or 
	 */
	public Person searchPersonByName(String name) {
		if (db.checkConnectivity()) {
			ArrayList<String> result = db.queryPersonByName("Select * from Person where name = '" + name + "'");
			if (result != null) {
				Person person = new Person();
				person.id = result.get(0);
				person.name = name;
				return person;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	/**
	 * Type person. Holds only id and name.
	 */
	public class Person {
		String id = "";
		String name = "";
	}

}
