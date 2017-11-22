package net.davidtanzer.persons;

public class Main {
	public static void main(String[] args) {
		System.out.println("Persons...");
		
		Person person1 = new Person("ssn1", "David", "Tanzer", 38);
		Person person2 = new Person("ssn1", "David", "Tanzer", 38);
		System.out.println(person1);
		System.out.println(person1 + " equal " + person2 + "? -> " + person1.equals(person2));

		System.out.println("Last step (make immutable) is still missing...");
}
}
