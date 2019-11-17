package com.akhil.demo.functional_programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class FlatMapExample 
{
    public static void main( String[] args )
    {
    	List<String> names = Arrays.asList("Peter", "Sam", "Greg" , "Ryan");
    	
    	System.out.println("Imperative Style: ");
    	for(String name : names)
    	{
    		if(!name.equals("Sam")) {
    			User user = new User(name);
    			System.out.println(user);
    		}
    	}
   
    	System.out.println("Functional Style: ");
    	names.stream()
    			.filter(name -> !name.equals("Sam"))
    			.map(User::new)   //.map(name -> new User(name))
    			.forEach(System.out::println);
    	
    	
    	List<User> userList = names.stream()
    				.filter(name -> !name.equals("Sam"))
    				.map(User::new)   //.map(name -> new User(name))
    				.collect(Collectors.toList());
    		
    	int sum = userList.stream()
    			.mapToInt(user -> user.getAge())
    			.sum();
    	
    	System.out.println("\nSum of ages of users: "+ sum);
    }
    
    static class User {
    	private String name;
		private Integer age = 30;

		public User(String name) {
			
			this.name = name;
		}
				
    	public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "User [name=" + name + ", age=" + age + "]";
		}
    	
    	
    	
    	
    }
}
