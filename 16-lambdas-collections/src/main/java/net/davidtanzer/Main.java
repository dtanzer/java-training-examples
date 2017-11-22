package net.davidtanzer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	private static List<Person> persons = new ArrayList<>();
	
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
		
		persons.stream()
		.map(p -> p.getAddress())
		.distinct()
		.forEach(a -> {
			System.out.println("Persons living in "+a);
			persons.stream()
			.filter(p -> p.getAddress().equals(a))
			.forEach(p -> System.out.println("\t"+p));
		});
	}

	private static void addPerson(String name, String street, String streetNo) {
		Address a = new Address(street, streetNo);
		Person p = new Person(name, a);
		
		persons.add(p);
	}
}
