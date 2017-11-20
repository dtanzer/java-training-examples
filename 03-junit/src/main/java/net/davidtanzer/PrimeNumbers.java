package net.davidtanzer;

import java.util.Arrays;

public class PrimeNumbers {

	public static int[] generate(int number) {
		int nextPrimeCandidate = 2;
		int[] result = new int[] {};
		
		while(number > 1) {
			result = Arrays.copyOf(result, result.length+1);
			while(number % nextPrimeCandidate != 0) {
				nextPrimeCandidate++;
			}
			result[result.length-1] = nextPrimeCandidate;
			number /= nextPrimeCandidate;
		}
		return result;
	}

}
