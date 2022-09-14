
public class Person {

	protected String name;
	private int age;
	
	public Person(String n, int a) {
		
		name = n;
		age = a;
	}
	
	void display() {
		
		System.out.println("Name of the perosn ->" + name);
		System.out.println("Person's age is ->" + age);
	}
}
