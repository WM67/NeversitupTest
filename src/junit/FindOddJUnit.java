package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import resource.FindOdd;

public class FindOddJUnit {
	@Test
	public void test() {
		FindOdd findOdd = new FindOdd();
		assertEquals(7, findOdd.getNumberFromOddOccurrence(new int[] { 7 }));
		assertEquals(0, findOdd.getNumberFromOddOccurrence(new int[] { 0 }));
		assertEquals(2, findOdd.getNumberFromOddOccurrence(new int[] { 1, 1, 2 }));
		assertEquals(0, findOdd.getNumberFromOddOccurrence(new int[] { 0, 1, 0, 1, 0 }));
		assertEquals(4, findOdd.getNumberFromOddOccurrence(new int[] { 1, 2, 2, 3, 3, 3, 4, 3, 3, 3, 2, 2, 1 }));
	}
}
