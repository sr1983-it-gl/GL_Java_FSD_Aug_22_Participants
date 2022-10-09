package com.gl.javafsd.dsa.arrayrotater;

import java.util.Random;

public class DataStructureUtils {

	public static int[] generateRandomSortedArray(int size) {
		
		int resultArray[] = new int[size];
		
		int initialValue = generateInitialRandomNumber();
		resultArray[0] = initialValue;
		
		for (int index = 1; index < size; index ++) {
			
			int prevValue = resultArray[index - 1];
			
			int random = (int)(Math.random() * 10) + 1;
			int currentValue = prevValue + random;
			
			resultArray[index] = currentValue;			
		}
		
		return resultArray;
	}
	
	private static int generateInitialRandomNumber() {
		
		double random = (Math.random() * 10) + 1;
		return (int)random;
	}
	
	public static int[] generateRandomArray(int size) {
			
		int resultArray[] = new int[size];
				
		for (int index = 0; index < size; index ++) {
						
			int random1 = (int)(Math.random() * 10) + 1;
			int random2 = (int)(Math.random() * 10) + 1;
						
			resultArray[index] = (random1 * random2) + (index + 3);			
		}
		
		return resultArray;
	}
	
	public static int pickRandomNumber(int[] array) {
		
		int size = array.length;
		
		Random random = new Random();
		int randomIndex = random.nextInt(size);
		
		return array[randomIndex];
	}
		
	
	public static int[] generateEvenNumbersRandomArray(int size) {
		
		int resultArray[] = new int[size];
				
		for (int index = 0; index < size; index ++) {
						
			int random1 = (int)(Math.random() * 10) + 1;
			int random2 = (int)(Math.random() * 10) + 1;
						
			int result = (random1 * random2) + (index + 3);
			if (result %2 == 0) {
				resultArray[index] = result;				
			}else {
				resultArray[index] = result + 1;
			}
		}
		
		return resultArray;
	}
	
	public static void print(int []array) {
		
		String result = new String();
		
		result = result + "{";		
		
		for (int index = 0; index < array.length; index ++) {
			
			int element = array[index];			
			result = result + element;			
			
			// Add comma, only when the element is not the last element
			
			if (index != (array.length - 1)) {
				result = result + " , ";
			}		
		}
		
		result = result + "}";
		
		System.out.println(result);
	}
}
