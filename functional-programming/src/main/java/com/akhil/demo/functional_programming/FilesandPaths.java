package com.akhil.demo.functional_programming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FilesandPaths {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		List<String> stringList =  Files.lines(Paths.get("/Users/Akhil Mittapally/eclipse-workspace/functional-programming/pom.xml"))
				.filter(line -> line.contains("name"))
				.map(line -> line.trim().replaceAll("name","")
								 .replaceAll("<", "")
								 .replaceAll(">", "")
								 .replaceAll("/", ""))
				.collect(Collectors.toList());
		
		System.out.println(stringList);
		
		System.out.println();
		
	
	}

}
