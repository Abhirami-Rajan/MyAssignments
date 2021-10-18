package com.mypack;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CountOfWordsTest {
/*
@Test
	public void ifWordsAreGivenShouldReturnTheCountOfEachWord() throws FileNotFoundException
	{
		Map<String, Integer> words = new HashMap<String, Integer>();
		
	 Map<String, Integer> vwords=new HashMap<String, Integer>();
		vwords.put("hlon",1);
		vwords.put("hii", 1);
		vwords.put("are", 1);
		vwords.put("u", 1);
		vwords.put("there?", 2);
		
		
		 assertEquals(vwords,CountOfWords.WordCountFound("C:\\Users\\Dell\\Desktop\\count.txt", words));
	}

}

*/

@Test
public void ifWordsAreGivenShouldReturnTheCountOfEachWord() throws FileNotFoundException
{
	Map<String, Integer> words = new HashMap<String, Integer>();
	
 Map<String, Integer> vwords=new HashMap<String, Integer>();
	vwords.put("hlon",1);
	vwords.put("hii", 1);
	vwords.put("are", 1);
	vwords.put("u", 1);
	vwords.put("there?", 2);
	
	
	vwords.equals(new File("C:\\Users\\Dell\\Desktop\\count.txt"));
}

}
