package com.g.javafsd.traveller;

public class DenominationCalculator {

	private int[] denominations;
	private int paymentAmount;
	
	private boolean outcome;
	
	public DenominationCalculator(
		int[] denominations, int paymentAmount) {
		
		this.denominations = denominations;
		this.paymentAmount = paymentAmount;	
		
		this.outcome = false;
	}
	
	public void calculate() {
		
		Sort sort = new Sort(denominations);
		sort.sortDesc();
				
		StringBuilder result = new StringBuilder();
		
		int tempAmount = paymentAmount;
		
		for (int index=0; index < denominations.length; index++) {
			
			int denominationValue = denominations[index];

			int quotient = tempAmount / denominationValue;
			int remainder = tempAmount % denominationValue;			
			
			if (quotient == 0) {
				
				// Dont consider this dennomiantion for the final outcome
				
			}else {
							
				result.append(String.format(
					"Denomination Value %d, DenominationCount %d", 
					denominationValue, quotient));
				result.append(System.getProperty("line.separator"));

				tempAmount = remainder;
			}
			
			if (remainder == 0) {
				this.outcome = true;
				break;
			}
		}	
		
		if (outcome) {
			
			System.out.println("Success");
			System.out.println(result);
		}else {
			System.out.println("Failure");
		}
		
	}
	
}
