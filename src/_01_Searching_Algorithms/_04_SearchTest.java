package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {
	String[] stringarr = { "this", "is", "inside", "the", "array" };
	int[] sortedIntArr = { 1, 2, 3, 4, 5, 7, 9 };
	int[] uniformarr = {3, 6, 9 ,12, 15};
	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD

	@Test
	public void testLinearSearch() {
		// 1. use the assertEquals method to test your linear search method.

		assertEquals(-1, _00_LinearSearch.linearSearch(stringarr, "not"));
		assertEquals(1, _00_LinearSearch.linearSearch(stringarr, "is"));
		assertEquals(2, _00_LinearSearch.linearSearch(stringarr, "inside"));

	}

	@Test
	public void testBinarySearch() {
		// 2. use the assertEquals method to test your binary search method.
		// remember that the array must be sorted
		assertEquals(-1, _01_BinarySearch.binarySearch(sortedIntArr, 1, 9, 16));
		assertEquals(1, _01_BinarySearch.binarySearch(sortedIntArr, 1, 9, 2));
		assertEquals(3, _01_BinarySearch.binarySearch(sortedIntArr, 1, 9, 4));
	}

	@Test
	public void testInterpolationSearch() {
		// 3. use the assertEquals method to test your interpolation search method.
		// remember that the array must be sorted and evenly distributed
		assertEquals(_02_InterpolationSearch.interpolationSearch(uniformarr, 6), 1);
		assertEquals(_02_InterpolationSearch.interpolationSearch(uniformarr, 3), 0);
		assertEquals(_02_InterpolationSearch.interpolationSearch(uniformarr, 4), -1);
	}

	@Test
	public void testExponentialSearch() {
		// 4. use the assertEquals method to test your exponential search method.
		// remember that the array must be sorted
	}
}
