package programmer;

public class Programmer {

	String preferredProgrammingLanguage;
	protected String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPreferredProgrammingLanguage(
			String preferredProgrammingLanguage) {
		
		this.preferredProgrammingLanguage = 
				preferredProgrammingLanguage;
	}
	
	public void display() {
		
		System.out.println("Preferred programming language "
				+ "for " + name + " is "
			+ preferredProgrammingLanguage);
	}
}
