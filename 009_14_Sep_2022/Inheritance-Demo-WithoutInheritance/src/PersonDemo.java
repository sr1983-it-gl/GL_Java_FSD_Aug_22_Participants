
public class PersonDemo {

	public static void main(String[] args) {
		

		Person sachin = new Person("Sachin", 45);
		sachin.display();
		
		System.out.println(sachin.getAge());
		sachin.setAge(44);
		
		System.out.println(sachin.getAge());
		
//		person.name = "Sachin T";
		
//		Person kohli = new Person("Kohli", 35);
//		kohli.display();
	}
}
