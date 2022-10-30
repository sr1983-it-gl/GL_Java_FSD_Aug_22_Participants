import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueOrderDemo {

	public static void main(String[] args) {
		
		Order o1 = new Order(5, 500F);
		Order o2 = new Order(4, 700F);
		Order o3 = new Order(2, 50);
		Order o4 = new Order(3, 900F);
		
		PriorityQueue<Order> ordersQueue = new PriorityQueue<>();
		ordersQueue.add(o1);ordersQueue.add(o2);ordersQueue.add(o3);
		ordersQueue.add(o4);
		
		printItems(ordersQueue);
	}
	
	private static void printItems(PriorityQueue<Order> queue) {
		
		System.out.println("---------------------");
		
		Iterator<Order> iterator  = queue.iterator();
		
		while (!queue.isEmpty()) {
			
			Order removedElement = queue.remove();
			System.out.println(removedElement);
		}
		
	}	
}
