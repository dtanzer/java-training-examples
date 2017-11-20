package net.davidtanzer.inheritance;

public class Dog extends Animal {
	public Dog() {
		super("Rover");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String speak() {
		return "woof";
	}

}
