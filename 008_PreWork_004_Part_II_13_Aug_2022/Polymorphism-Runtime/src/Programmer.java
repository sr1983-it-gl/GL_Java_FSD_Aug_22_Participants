

public class Programmer {

	String preferredProgrammingLanguage;
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPreferredProgrammingLanguage(
			String preferredProgrammingLanguage) {
		
		this.preferredProgrammingLanguage = 
				preferredProgrammingLanguage;
	}
	
	public void display() {
		
		System.out.println("Programmer.Display");
		System.out.println("Preferred programming language "
				+ "for " + name + " is "
			+ preferredProgrammingLanguage);
	}
}
