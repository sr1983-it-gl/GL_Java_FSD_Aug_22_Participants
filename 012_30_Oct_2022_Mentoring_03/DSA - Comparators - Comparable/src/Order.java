
public class Order implements Comparable<Order> {

	private int noOfItems;
	private float price;
	
	public Order(int noOfItems, float price) {
		this.noOfItems = noOfItems;
		this.price = price;
	}
	
	public int getNoOfItems() {
		return noOfItems;
	}
	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public String toString() {
		return "No Of Orders -> " + noOfItems + ", Amount -> " + price;
	}

	@Override
	public int compareTo(Order o2) {
		
		// Descending Order - Price
		
		Order o1 = this;
		
		if (o1.price < o2.price) {
			return +1;
		}else if (o1.price > o2.price) {
			return -1;
		}else {
			return 0;
		}
				
	}
	

}
