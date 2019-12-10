package com.springlearning.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
			
		ConfigurableApplicationContext applicationcontext = SpringApplication.run(DemoApplication.class, args);
			//BinarySearchIMPL binarysearch=new BinarySearchIMPL(new BubbleSortAlgorithm());
		 BinarySearchIMPL binarysearch = applicationcontext.getBean(BinarySearchIMPL.class);
	int result=binarysearch.binarysearch(new int[] {12,3,8},3);
	System.out.println(result);
		
	}

}
