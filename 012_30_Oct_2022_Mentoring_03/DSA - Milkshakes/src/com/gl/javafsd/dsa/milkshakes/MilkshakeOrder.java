package com.gl.javafsd.dsa.milkshakes;

public class MilkshakeOrder implements Comparable<MilkshakeOrder> {

	private String itemName;
	private int quantity;
	
	public MilkshakeOrder(String itemName, int quantity) {
		
		this.itemName = itemName;
		this.quantity = quantity;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void decrementQuantityBy(int quantity) {
		
		setQuantity(getQuantity() - quantity);
	}

	@Override
	public int compareTo(MilkshakeOrder o2) {
		
		// Descending order - based on quantity contained in order 
		MilkshakeOrder o1 = this;
		
		if (o1.quantity < o2.quantity) {
			return +1;
		}else if (o1.quantity > o2.quantity) {
			return -1;
		}else {
			return 0;
		}
	}
	
	public boolean hasActiveItems() {
		
		if (quantity != 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		return "[Item Name -> " + itemName + ", Quantity ->" + quantity + "]";
	}
}
