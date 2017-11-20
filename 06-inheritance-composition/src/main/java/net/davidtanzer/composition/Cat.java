package net.davidtanzer.composition;

public class Cat implements Animal {
	private NamedAnimal namedAnimal;

	public Cat() {
		namedAnimal = new NamedAnimal("Heathcliff");
	}

	@Override
	public String name() {
		return namedAnimal.getName();
	}

	@Override
	public String speak() {
		return "meeow";
	}
}
