package com.firstpack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class SortedNumbers {
	
	public static List<Integer> sorting(List<Integer> list) {
		
		List<Integer>sortedList=list.stream().sorted().distinct().collect(Collectors.toList());
		
		System.out.println(sortedList);
		
		return sortedList;	
		}
public static void main(String[] args) {
	  
	Scanner file=null;
	
	ArrayList<Integer> list=new ArrayList<Integer>();
		// TODO Auto-generated method stub
    
	try {
		
		 file = new Scanner(new File("C:\\Users\\Dell\\Desktop\\test.txt"));
		
		 System.out.println("File found");
	} 
	
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		
		e.printStackTrace();
		
		System.out.println(e);
	}
     while(file.hasNext()){
    	 
    	 if(file.hasNextInt()) {
    		
    		 list.add(file.nextInt());
    	 }
    	 else file.next();
		}
     List<Integer> sortedNumbers =sorting(list);	
		
     System.out.println(sortedNumbers);
	
	}

}
		