package com.gl.javafsd.dsa.milkshakes;

import java.util.Iterator;
import java.util.PriorityQueue;

public class OrderProcessor {

	private PriorityQueue<MilkshakeOrder> ordersQueue;
	private JuiceMachine juiceMachine;
	private Result result;
	
	public OrderProcessor() {
		ordersQueue = new PriorityQueue<>();
		juiceMachine = new JuiceMachine();
	}

	public Result process(MilkshakeOrder ... orders) {
		
		for (MilkshakeOrder order : orders) {
			ordersQueue.add(order);
		}
		
		Iterator<MilkshakeOrder> iterator  = ordersQueue.iterator();
		
		while (!ordersQueue.isEmpty()) {						
			
			// First item
			MilkshakeOrder order1 = null;
			if (iterator.hasNext()) {
				order1 = ordersQueue.remove();
			}
			
			// Second item
			MilkshakeOrder order2 = null;
			if (iterator.hasNext()) {
				order2 = ordersQueue.remove();
			}
			
			result = juiceMachine.accept(order1, order2);
			if (result.isDone()) {
				break;
			}else {
				
				if (order1.hasActiveItems()) {
					ordersQueue.add(order1);
				}
				
				if  (order2.hasActiveItems()) {
					ordersQueue.add(order2);
				}
			}
			
			System.out.println(order1);
		}
		
		return result;
	}
	
}
