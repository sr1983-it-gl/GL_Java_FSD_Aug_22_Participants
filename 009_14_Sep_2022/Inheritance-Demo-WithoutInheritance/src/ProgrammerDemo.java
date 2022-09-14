
public class ProgrammerDemo {

	public static void main(String[] args) {
		
		Programmer john = new Programmer(
			"John", 25, "java, javascript");
		john.display();
		
		Programmer shella = new Programmer(
			"Sheela", 24, "python, node js");
		shella.display();
	}
}
