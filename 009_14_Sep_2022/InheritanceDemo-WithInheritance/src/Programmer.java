
public class Programmer extends Person{

	private String languageSkills;

	public Programmer(String n, int a, String skills) {
		
		super(n, a);
		
		languageSkills = skills;		
	}
	
	public void display() {
		
		super.display();
		
		String formatted = "%" + name + "%";
		
		System.out.println("Languages Skill ->" + languageSkills);
	}
}
