
public class Programmer {

	private String name;
	private int age;
	
	private String languageSkills;
	
	public Programmer(String n, int a, String skills) {
		
		name = n;
		age = a;
		languageSkills = skills;
	}
	
	public void display() {
		
		System.out.println("Name is ->" + name);
		System.out.println("Age is ->" + age);
		System.out.println("Programming languages " + languageSkills);
	}
}
