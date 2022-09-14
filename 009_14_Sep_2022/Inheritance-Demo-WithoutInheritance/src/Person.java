
public class Person {

	private String name;
	private int age;
	
	public Person(String n, int a) {
		
		name = n;
		age = a;
	}
	
	void display() {
		
		System.out.println("Name of the perosn ->" + name);
		System.out.println("Person's age is ->" + age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
