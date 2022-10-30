package com.gl.javafsd.dsa.milkshakes;

public class Main {

	public static void main(String[] args) {
	
		minimumTimeCalculator(5, 4, 4);
//		minimumTimeCalculator(3, 0, 0);
//		minimumTimeCalculator(1, 4, 2);
		
	}
	
	private static void minimumTimeCalculator(
		int mangoQuantity, int orangeQuantity, int pineAppleQuantity) {
		
		System.out.println("------------------------");
		
		MilkshakeOrder mangoOrder =  new MilkshakeOrder("Mango", mangoQuantity);
		MilkshakeOrder orangeOrder = new MilkshakeOrder("Orange", 
				orangeQuantity);
		MilkshakeOrder pineAppleOrder = new MilkshakeOrder("Pine Apple", 
				pineAppleQuantity);
		
		OrderProcessor processor = new OrderProcessor();
		
		processor.process(mangoOrder, orangeOrder, pineAppleOrder);
	}
}
