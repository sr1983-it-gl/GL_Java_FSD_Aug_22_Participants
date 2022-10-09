package com.gl.javafsd.dsa.arraysearch;

import com.gl.javafsd.dsa.arrayrotater.DataStructureUtils;

public class ArraySearcherTest {

	public static void main(String[] args) {
		
//		searchInvalidElementTest();
		searchValidElementTest();
	}
	
	static void searchInvalidElementTest() {
		
		int array[] = DataStructureUtils.generateRandomArray(10);
		DataStructureUtils.print(array);
		
		ArraySearcher searcher = new ArraySearcher(array);
		
		int searchElement = -999999;
		int result = searcher.searchForElement(searchElement);
		
		System.out.println(String.format(
			"Position of search element %d is %d", searchElement, result));
	}

	static void searchValidElementTest() {
		
		int array[] = {15 , 14 , 10 , 20 , 79 , 17 , 19 , 74 , 13 , 92};
		DataStructureUtils.print(array);
		
		ArraySearcher searcher = new ArraySearcher(array);
		
		int searchElement = 19;
		int result = searcher.searchForElement(searchElement);
		
		System.out.println(String.format(
			"Position of search element %d is %d", searchElement, result));
	}

}
