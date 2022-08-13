
public class ConditionsDemoSimple {

	public static void main2(String[] args) {
		
//		name=GreatLeaning = args[0]
//		myFavColor=green args[1]
		
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
