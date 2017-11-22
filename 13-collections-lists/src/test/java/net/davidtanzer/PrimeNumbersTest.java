package net.davidtanzer;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimeNumbersTest {
	@Test
	public void oneHasNoPrimeFactors() {
		List<Integer> factors = PrimeNumbers.generate(1);
		assertListEquals(Arrays.asList(), factors);
	}
	
	private void assertListEquals(List<Object> expected, List<Integer> actual) {
		assertArrayEquals(expected.toArray(), actual.toArray());
	}

	@Test
	public void twoHasSinglePrimeFactor() {
		List<Integer> factors = PrimeNumbers.generate(2);
		
		assertListEquals(Arrays.asList(2), factors);
	}

	@Test
	public void fourHasTwoPrimeFactors() {
		List<Integer> factors = PrimeNumbers.generate(4);
		
		assertListEquals(Arrays.asList(2, 2), factors);
	}
	
	@Test
	public void twelveHasThreePrimeFactors() {
		List<Integer> factors = PrimeNumbers.generate(12);
		
		assertListEquals(Arrays.asList(2, 2, 3), factors);
	}
}
