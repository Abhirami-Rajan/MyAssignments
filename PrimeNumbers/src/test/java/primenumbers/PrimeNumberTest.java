package primenumbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class PrimeNumberTest {
	
	@Test
	public void primeNumberTestWithMultithreading() throws Exception {
		
		String s1 = " 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 ";
		String s2 = " 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 ";
		assertEquals(s1, PrimeThread.PrimeFound(100));
		assertEquals(s2, PrimeThread.PrimeFound(60));
	}

}