package net.davidtanzer;

public class Main {
	public static void main(String[] args) {
		net.davidtanzer.inheritance.Animal cat1 = new net.davidtanzer.inheritance.Cat();
		net.davidtanzer.inheritance.Animal dog1 = new net.davidtanzer.inheritance.Dog();
		System.out.println("Cat 1 is called "+cat1.name()+" and says \""+cat1.speak()+"\".");
		System.out.println("Dog 1 is called "+dog1.name()+" and says \""+dog1.speak()+"\".");
		
		net.davidtanzer.composition.Animal cat2 = new net.davidtanzer.composition.Cat();
		net.davidtanzer.composition.Animal dog2 = new net.davidtanzer.composition.Dog();
		System.out.println("Cat 2 is called "+cat2.name()+" and says \""+cat2.speak()+"\".");
		System.out.println("Dog 2 is called "+dog2.name()+" and says \""+dog2.speak()+"\".");
	}
}
