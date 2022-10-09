package com.gl.javafsd.dsa.mergesort;

public class DividePhase {

	private int[] array;
	
	public DividePhase(int[] array) {
		this.array = array;
	}
	
	public void divide() {
	
		divide("Root", 0, array.length);
	}
	
	void divide(String indicator, int begin, int end) {

		if (begin < end) {

			System.out.println(
					String.format(
					"%s -> Begin and End [%d %d]", indicator, begin, end));
				
			int middle = (begin + end) / 2;
			
			divide("L", begin, middle);
			divide("R", (middle + 1), end);	
			
//			ConquerPhase conquerPhase = new ConquerPhase(array);
//			conquerPhase.conquer(begin, middle, end);
		}		
	}
}
