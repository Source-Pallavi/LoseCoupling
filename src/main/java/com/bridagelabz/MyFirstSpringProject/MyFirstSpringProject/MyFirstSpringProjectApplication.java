package com.bridagelabz.MyFirstSpringProject.MyFirstSpringProject;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyFirstSpringProjectApplication {
private SortingAlog sortingAlog;
	public static void main(String[] args) {
//		BinarySearchAlgoImpl binarySearchAlgo= new BinarySearchAlgoImpl( new BubbleSortAlgo());
//		int result = binarySearchAlgo.binarySearch( new int[]{1,2,3},3);
//		System.out.println(binarySearchAlgo);
//		System.out.println(result);
		ConfigurableApplicationContext applicationContext=SpringApplication.run(MyFirstSpringProjectApplication.class,args);
		BinarySearchAlgoImpl bean=applicationContext.getBean(BinarySearchAlgoImpl.class);
		int result=bean.binarySearch( new int[] {8,9,0,3},3);
	System.out.println(result);

	}

}
