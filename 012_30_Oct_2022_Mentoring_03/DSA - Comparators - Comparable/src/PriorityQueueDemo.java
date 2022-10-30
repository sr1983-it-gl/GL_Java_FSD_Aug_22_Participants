import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		/*
		float f = 100.0F;		
		int i = 100;		
		f = i;
		
		byte b = 100;
		f = b;
		
		float f1 = 100.12;
		*/
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		printItems(queue);
		
		PriorityQueue<Integer> queue2 = new PriorityQueue<>(
			Collections.reverseOrder());
		printItems(queue2);		
	}
	
	private static void printItems(PriorityQueue<Integer> queue) {
		
		System.out.println("---------------------");
		queue.add(10);
		queue.add(5);
		queue.add(25);
		queue.add(7);
		
		Iterator<Integer> iterator  = queue.iterator();
		
		while (!queue.isEmpty()) {
			
			Integer removedElement = queue.remove();
			System.out.println(removedElement);
		}
		
	}
}
