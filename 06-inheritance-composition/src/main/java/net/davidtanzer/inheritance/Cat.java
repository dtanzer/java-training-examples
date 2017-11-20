package net.davidtanzer.inheritance;

public class Cat extends Animal {
	public Cat() {
		super("Riff-Raff");
	}

	@Override
	public String speak() {
		return "Meeow";
	}
}
