
public class Demo {

	public static void main(String[] args) {
		
		Person sachin = new Person("Sachin", 45);
		sachin.display();

		sachin.name = "Sachin T";
		
		System.out.println("--------------------");
		Programmer johny = 
			new Programmer("John", 25, "Java, JavaScript");
		johny.display();
		
	}
}
