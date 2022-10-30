import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumbersSortingDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(5);
		numbers.add(25);
		numbers.add(-100);
		numbers.add(-50);
		numbers.add(-5);
		numbers.add(7);
		
		System.out.println("BEfore Sorting ->" + numbers);
		Collections.sort(numbers);
		System.out.println("After Sorting ->" + numbers);
	}
}
