package com.mypack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class CountOfWords {

/*
 static Map<String,Integer>WordCountFound(String filepath,Map<String,Integer>words) throws FileNotFoundException{
	  Scanner file= new Scanner(new File(filepath));
	  while(file.hasNext()) {
		  String word=file.next();
		  Integer count=words.get(word);
		  if(count!=null) {
			  count=count+1;
		  }  else
				  count=1;
			 words.put(word, count); 
		  }
	  file.close();
	  return words;
	  
	  }
  public  static void main(String[] args) throws FileNotFoundException {
	  Map<String,Integer>words=new HashMap<String,Integer>();
	  WordCountFound("C:\\Users\\Dell\\Desktop\\count.txt", words);
	  System.out.println(words);
  }
  }


*/


	

	static Map<String,Integer> CountEachWords(List<String> list) throws FileNotFoundException {
		Map<String,Long> result = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(result);
		return null;
	}

	public static void main(String[] args) throws FileNotFoundException {		
		Scanner s = new Scanner(new File("C:\\Users\\Dell\\Desktop\\count.txt"));
		List<String> list = new ArrayList<String>();
		while (s.hasNext())
		{
			list.add(s.next());
		}
		s.close();
	    CountEachWords(list);
	//	System.out.println(list);
	}	

}	

