package solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyCoinChangeSolutionTest {

	MyCoinChangeSolution coinChangeCalculator = new MyCoinChangeSolution();

	/**
	 * Tests the following scenario if amount = 4 and the given coins are {1,2,3}
	 * then there should be 4 solutions.
	 */
	@Test
	public void testFindChangeCombinations1() {
		assertEquals(4, coinChangeCalculator.findChangeCombinations(4, new int[] { 1, 2, 3 }));
	}

	/**
	 * Tests the following scenario if amount = 10 and the given coins are {2,5,3,6}
	 * then there should be 5 solutions.
	 */
	@Test
	public void testFindChangeCombinations2() {
		assertEquals(5, coinChangeCalculator.findChangeCombinations(10, new int[] { 2, 5, 3, 6 }));
	}

	/**
	 * Tests the following scenario if amount = 0 and the given coins are {0} then
	 * there should be 0 solutions.
	 */
	@Test
	public void testFindChangeCombinations3() {
		assertEquals(0, coinChangeCalculator.findChangeCombinations(0, new int[] { 0 }));
	}

	/**
	 * Tests the following scenario if amount = 0 and the given coins are {2,5,7}
	 * then there should be 0 solutions.
	 */
	@Test
	public void testFindChangeCombinations4() {
		assertEquals(0, coinChangeCalculator.findChangeCombinations(0, new int[] { 2, 5, 7 }));
	}


}