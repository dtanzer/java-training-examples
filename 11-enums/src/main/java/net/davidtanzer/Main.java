package net.davidtanzer;

public class Main {
	public static void main(String[] args) {
		Weekday monday = Weekday.MONDAY;
		System.out.println("Current weekday is "+monday);
		
		for(Weekday day : Weekday.values()) {
			System.out.println(day + " is working day? " + day.isWorkingDay());
			System.out.println("    special discount is " + day.discount() + "%");
		}
	}
}
