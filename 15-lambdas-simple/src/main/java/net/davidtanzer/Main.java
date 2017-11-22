package net.davidtanzer;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
	public static void run(Runnable r) {
		r.run();
	}
	public static void consume(Consumer<String> c) {
		c.accept("Linz");
	}
	public static void decide(Predicate<String> p) {
		String toTest = "Hello World";
		System.out.println(toTest + " satisfies predicate? " + p.test(toTest));
	}
	public static void calc(Function<String, Integer> f) {
		String toCalc = "Hello World";
		System.out.println(toCalc + " results in " + f.apply(toCalc));
	}
	
	public static void main(String[] args) {
		run(() -> System.out.println("Hello World"));
		consume(toGreet -> System.out.println("Hello "+toGreet));
		decide(toTest -> toTest.contains("rl"));
		calc(toCalc -> toCalc.length());
	}
}
