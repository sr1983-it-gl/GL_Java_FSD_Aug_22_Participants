
public class ConditionsDemoSimple {

	public static void main(String[] args) {
		
		boolean someCondition = true;
		
		if (someCondition) {
			System.out.println("Value is true");
		}
		
		someCondition = false;
		if (someCondition) {
			System.out.println("Printing some other thing");
		}
	}
}
