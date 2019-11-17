package com.akhil.demo.functional_programming;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Streams 
{
    public static void main( String[] args )
    {
    	List<String> names = Arrays.asList("Peter", "Sam", "Greg" , "Ryan");
    	
    	for(String name : names)
    	{
    		if(!name.equals("Sam")) {
    			System.out.println(name);
    		}
    	}
    	
//    	names.stream()
//    			.filter(new Predicate<String>() {
//    				public boolean test(String name) {
//    					return !name.equals("Sam");
//    					 					
//    				}
//				})
//    			.forEach(name -> System.out.println(name));
    	
    	names.stream()
    			.filter(name -> !name.equals("Sam"))
    			.forEach(System.out::println);
    	
    
    	
    	
    			
    }
}
