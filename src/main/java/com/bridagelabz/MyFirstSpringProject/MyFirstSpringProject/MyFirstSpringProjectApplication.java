package com.bridagelabz.MyFirstSpringProject.MyFirstSpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstSpringProjectApplication {
private SortingAlog sortingAlog;
	public static void main(String[] args) {
		BinarySearchAlgoImpl binarySearchAlgo= new BinarySearchAlgoImpl( new BubbleSortAlgo());
		int result = binarySearchAlgo.binarySearch( new int[]{1,2,3},3);
		System.out.println(binarySearchAlgo);
		System.out.println(result);
		//SpringApplication.run(MyFirstSpringProjectApplication.class, args);

	}

}
