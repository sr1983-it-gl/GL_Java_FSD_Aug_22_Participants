package com.gl.javafsd.paymoney;

import java.util.Arrays;

public class TargetDeterminator {

	private int[] transactions;
	private int dailyTarget;
	
	private boolean outcome;
	
	public TargetDeterminator(int[] transactions, int dailyTarget) {
		
		this.transactions = transactions;
		this.dailyTarget = dailyTarget;
	}
	
	void determine() {
		
		int tempSum = 0;		
		int counter = 0;
		
		for (int index = 0; index < transactions.length; index ++) {
			
			int transactionValue = transactions[index];
			
			tempSum = tempSum + transactionValue;
			
			if (tempSum >= dailyTarget) {
			
				outcome = true;
				counter = index + 1;
				break;
			}
		}
				
		if (outcome) {
			System.out.println(
				String.format(
			"Daily target of %d is achieved after %d transactions - [%s]", 
				dailyTarget, counter, Arrays.toString(transactions)));
		}else {
			System.out.println(
				String.format(
				"Daily target of %d CANNOT BE Achieved - [%s]", 
				dailyTarget, Arrays.toString(transactions)));
		}
	}
}
