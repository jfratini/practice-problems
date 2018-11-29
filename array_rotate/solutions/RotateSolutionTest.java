import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class RotateSolutionTest {

	/**
	 * Test the following scenario: Given [1,2,3] and n=1, should return [3,1,2]
	 */
	@Test
	public void testRotate1() {
		int[] input = new int[] { 1, 2, 3 };
		int[] actual = RotateSolution.rotateArray(1, input);
		assertArrayEquals(new int[] { 3, 1, 2 }, actual);
	}

	/**
	 * Test the following scenario: Given [1,2,3,4,5] and n=3, should return
	 * [3,4,5,1,2]
	 */
	@Test
	public void testRotate2() {
		int[] input = new int[] { 1, 2, 3, 4, 5 };
		int[] actual = RotateSolution.rotateArray(3, input);
		assertArrayEquals(new int[] { 3, 4, 5, 1, 2 }, actual);
	}

	/**
	 * Test the following scenario: Given [1,2,3,4,5] and n=5, should return
	 * [1,2,3,4,5]
	 */
	@Test
	public void testRotate3() {
		int[] input = new int[] { 1, 2, 3, 4, 5 };
		int[] actual = RotateSolution.rotateArray(5, input);
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, actual);
	}

	/**
	 * Test the following scenario: Given [1,2,3,4,5] and n=6, should return
	 * [5,1,2,3,4]
	 */
	@Test
	public void testRotate4() {
		int[] input = new int[] { 1, 2, 3, 4, 5 };
		int[] actual = RotateSolution.rotateArray(6, input);
		assertArrayEquals(new int[] { 5, 1, 2, 3, 4 }, actual);
	}

	/**
	 * Test the following scenario: Given [1,2,3,4,5] and n=15, should return
	 * [1,2,3,4,5]
	 */
	@Test
	public void testRotate5() {
		int[] input = new int[] { 1, 2, 3, 4, 5 };
		int[] actual = RotateSolution.rotateArray(15, input);
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, actual);
	}

	/**
	 * Test the following scenario: Given [1] and n=1, should return [1]
	 */
	@Test
	public void testRotate6() {
		int[] input = new int[] { 1 };
		int[] actual = RotateSolution.rotateArray(1, input);
		assertArrayEquals(new int[] { 1 }, actual);
	}
	
	/**
	 * Test the following scenario: Given [1] and n=2, should return [1]
	 */
	@Test
	public void testRotate7() {
		int[] input = new int[] { 1 };
		int[] actual = RotateSolution.rotateArray(2, input);
		assertArrayEquals(new int[] { 1 }, actual);
	}
	
	/**
	 * Test the following scenario: Given [] and n=2, should return []
	 */
	@Test
	public void testRotate8() {
		int[] input = new int[] {};
		int[] actual = RotateSolution.rotateArray(2, input);
		assertArrayEquals(new int[] {}, actual);
	}

}