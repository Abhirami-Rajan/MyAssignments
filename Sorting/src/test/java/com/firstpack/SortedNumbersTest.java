package com.firstpack;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class SortedNumbersTest {

	@Test
	public void givenElementsToSortThenShouldReturnSortedElements()
	{
		List<Integer> actual = new ArrayList<Integer>(Arrays.asList(8,7,3,9,1,3));
		
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,3,7,8,9));
		
		assertEquals(expected, SortedNumbers.sorting(actual));
	}

}

