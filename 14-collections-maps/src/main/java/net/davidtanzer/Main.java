package net.davidtanzer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	private static List<Person> persons = new ArrayList<>();
	private static Map<Address, List<Person>> addresses = new HashMap<>();
	
	public static void main(String[] args) {
		addPerson("Elisabeth", "High Street", "25");
		addPerson("John", "High Street", "25");
		addPerson("Dorothea", "Mall Lane", "13");
		addPerson("Mike", "Mall Lane", "14");
		addPerson("Janet", "Mall Lane", "14");
		
		System.out.println("Persons");
		for(Person p : persons) {
			System.out.println("\t"+p);
		}
		
		for(Address a : addresses.keySet()) {
			System.out.println("Persons living in "+a);
			for(Person p : addresses.get(a)) {
				System.out.println("\t"+p);
			}
		}
	}

	private static void addPerson(String name, String street, String streetNo) {
		Address a = new Address(street, streetNo);
		Person p = new Person(name, a);
		
		persons.add(p);
		if(!addresses.containsKey(a)) {
			addresses.put(a, new ArrayList<Person>());
		}
		addresses.get(a).add(p);
	}
}
