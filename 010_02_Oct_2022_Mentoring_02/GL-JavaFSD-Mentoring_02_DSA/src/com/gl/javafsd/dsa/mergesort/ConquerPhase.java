package com.gl.javafsd.dsa.mergesort;

public class ConquerPhase {

	private int[] array;
	
	public ConquerPhase(int[] array) {
		this.array = array;
	}
	
	public void conquer(int begin, int middle, int end) {
		
		String temp = String.format("Merging happening on two array " +
		" aArray [%d %d] and bArray [%d %d]",
			begin, middle, (middle + 1), end);
	
		System.out.println(temp);
		
//		Merging merge = new Merging(array, array);
//		merge.merge();
	}
}
