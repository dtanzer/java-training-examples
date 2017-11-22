package net.davidtanzer;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

	public static List<Integer> generate(int number) {
		int nextPrimeCandidate = 2;
		List<Integer> result = new ArrayList<>();
		
		while(number > 1) {
			while(number % nextPrimeCandidate != 0) {
				nextPrimeCandidate++;
			}
			result.add(nextPrimeCandidate);
			number /= nextPrimeCandidate;
		}
		return result;
	}

}
