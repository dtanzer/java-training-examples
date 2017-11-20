package net.davidtanzer.composition;

public class Dog implements Animal {
	private NamedAnimal namedAnimal;

	public Dog() {
		namedAnimal = new NamedAnimal("Buck");
	}

	@Override
	public String name() {
		return namedAnimal.getName();
	}

	@Override
	public String speak() {
		return "wau";
	}

}
