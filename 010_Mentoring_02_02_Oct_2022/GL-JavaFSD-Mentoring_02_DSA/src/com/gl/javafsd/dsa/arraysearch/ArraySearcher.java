package com.gl.javafsd.dsa.arraysearch;

public class ArraySearcher {

	private int[] array;
	
	public ArraySearcher(int [] array) {
		this.array = array;
	}
	
	public int searchForElement(int searchElement){
		
		int length = array.length;
		
		for (int index = 0; index < length; index ++) {
			
			int currentElement = array[index];
			
			if (currentElement == searchElement) {
				return index;
			}
		}
		return -1;
	}
}
