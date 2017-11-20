package net.davidtanzer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumbersTest {
	@Test
	public void oneHasNoPrimeFactors() {
		int[] factors = PrimeNumbers.generate(1);
		
		assertArrayEquals(new int[] {}, factors);
	}
	
	@Test
	public void twoHasSinglePrimeFactor() {
		int[] factors = PrimeNumbers.generate(2);
		
		assertArrayEquals(new int[] {2}, factors);
	}

	@Test
	public void fourHasTwoPrimeFactors() {
		int[] factors = PrimeNumbers.generate(4);
		
		assertArrayEquals(new int[] {2,2}, factors);
	}
	
	@Test
	public void twelveHasThreePrimeFactors() {
		int[] factors = PrimeNumbers.generate(12);
		
		assertArrayEquals(new int[] {2,2,3}, factors);
	}
}
