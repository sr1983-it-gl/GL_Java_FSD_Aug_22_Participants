package com.gl.javafsd.dsa.arraysearch;

public class DividePhase {

	private int[] array;
	
	public DividePhase(int[] array) {
		this.array = array;
	}
		
	
	public void divide(int searchElement) {
	
		int result = startDivide(searchElement);
		
		System.out.println();
	}
	
	int startDivide(int searchElement) {
		
		int startIndex = 0;
		int endIndex = array.length - 1;
		
		while (startIndex <= endIndex) {

			int middleIndex = (startIndex + endIndex) / 2;
			int middleElement = array[middleIndex];
			
			if (searchElement > middleElement) {
				
				System.out.println(String.format(
					"Search Element %d present on the right side of the array", 
						searchElement));
				
				startIndex = middleIndex +1;
				
			}else if (searchElement < middleElement) {
				System.out.println(String.format(
					"Search Element %d present on the left side of the array",
						searchElement));
				
				endIndex = middleIndex -1;
			}else if (searchElement == middleElement) {			
				System.out.println(String.format(
					"Search Element %d is present at the position %d", 
						middleElement, middleIndex));
				
				return middleIndex;
			}			
		}	
		
		return -1;
	}
}
