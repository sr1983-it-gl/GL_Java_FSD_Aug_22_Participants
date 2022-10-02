package com.gl.javafsd.dsa.arrayrotater;

public class ArrayRotater {
	
//	private int[] tArray;

//	public ArrayRotater(int []array) {
//	
//	tArray = array;
//	
//}

	private int[] array;
	
	public ArrayRotater(int []array) {
		
		this.array = array;		
	}
	
	public void rotateLeft(int byHowManyPositions) {
		
		for (int index = 0; index < byHowManyPositions; index ++) {
			rotateLeft();
		}
	}
	
	// {2, 4, 6, 8, 10}
	public void rotateLeft() {
	
		int length = array.length;
		
		int zerothElement = array[0];
		
		// 0, 1 , 2, 3, 4
		for (int currentIndex = 0; currentIndex < (length - 1); currentIndex ++) {
			
			int nextPosition = (currentIndex + 1);
			int nextElement = array[nextPosition];
			
			int currentPosition = currentIndex;
			array[currentPosition] = nextElement;					
		}
		
		int lastPosition = (length - 1);
		array[lastPosition] = zerothElement;
	}
}
