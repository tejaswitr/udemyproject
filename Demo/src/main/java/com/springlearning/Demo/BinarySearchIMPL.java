package com.springlearning.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchIMPL {
	@Autowired
	private SortAlgorithm sortalgorithm;
	
public BinarySearchIMPL(SortAlgorithm sortalgorithm) {
		super();
		this.sortalgorithm= sortalgorithm;
	}

//public BinarySearchIMPL(BubbleSortAlgorithm sortalgorithm2) {
	// TODO Auto-generated constructor stub
//}

public int binarysearch(int[] numbers,int numbertosearchfor)
{
	//implementing the sorting logic
	//(implemented using bubble sort algorithm and quick sort algorithm)
//	BubbleSortAlgorithm bubblesortalgorithm=new BubbleSortAlgorithm();
	int[] sortednumbers = sortalgorithm.sort(numbers);
	System.out.println(sortalgorithm);
	
	//search the array
	//return the result
	return 3;
}
	
	
	
}
