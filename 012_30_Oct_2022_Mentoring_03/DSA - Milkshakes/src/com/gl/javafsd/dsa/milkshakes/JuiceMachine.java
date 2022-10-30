package com.gl.javafsd.dsa.milkshakes;

public class JuiceMachine {

	private Result result;
	
	public JuiceMachine() {
		result = new Result();
	}
	
	public Result accept(MilkshakeOrder o1, MilkshakeOrder o2) {
		
		int quantity1 = 0;
		
		if (o1 != null) {			
			quantity1 = o1.getQuantity();
		}
		
		int quantity2 = 0;
		if (o2 != null) {
			quantity2 = o2.getQuantity();			
		}
		
		// Mango - 5, Pineapple - 4
		if (quantity1 > 0 && quantity2 > 0) {
			
			System.out.println(
				String.format("Order happening on %s and %s", 
					o1.toString(), o2.toString()));
			
			result.incrementNoOfSeconds(1);
			
			o1.decrementQuantityBy(1);
			o2.decrementQuantityBy(1);
		}
		
		// Mango - 4 , Pineapple - 0
		// Current Time - 3
		// Current Time - 3 [+4] = 7
		if (o1.hasActiveItems() && !o2.hasActiveItems()) {
			
			result.incrementNoOfSeconds(o1.getQuantity());
			result.setStatus("DONE");
			
			return result;
		}
		
		// Mango - 0 , Pineapple - 5
		// Current Time - 2
		// Current Time - 2 [+ 5] = 7 
		if (!o1.hasActiveItems() && o2.hasActiveItems()) {
			
			result.incrementNoOfSeconds(o2.getQuantity());
			result.setStatus("DONE");
			
			return result;
		}
		
		return result;
	}
}
