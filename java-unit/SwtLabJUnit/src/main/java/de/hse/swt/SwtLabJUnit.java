package de.hse.swt;

public class SwtLabJUnit {
	public class Person {
		public String name = "";
		public String street = "";
		public String city = "";
		public String country = "";
	}

	/**
	 * Creates a person object out of a given address string. <BR>
	 * <BR>
	 * Example input:<BR>
	 * "Max Mustermann, Musterstrasse 12, 12345 Musterstadt, Musterland"
	 * 
	 * @param address - comma-separated list of name, street, city, (optional)
	 *                country<BR>
	 * @returna person object
	 */
	public Person addressStringToObj(String address) {
		
		Person person = new Person();
		String[] addr = address.split(",");
		if (addr.length == 4) {
			person.name = addr[0];
			person.street = addr[1];
			person.city = addr[2];
			person.country = addr[3];

		} else if (addr.length == 3) {
			person.name = addr[0];
			person.street = addr[1];
			person.city = addr[2];
		} else {
			return null;
		}
		return person;
	}
}
