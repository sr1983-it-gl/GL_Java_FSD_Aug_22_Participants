
public class SingleInheritanceDemo {

	public static void main(String[] args) {
		
		
		ApplicationProgrammer john = 
			new ApplicationProgrammer();
		
		john.setName("John");
		john.setPreferredProgrammingLanguage("Java Script");		
		john.setDevelopedApplication("Google Chrome");
		
		john.display();
		
		System.out.println("-----------------");
		
		ApplicationProgrammer kiran 
			= new ApplicationProgrammer();
		kiran.setName("Kiran");
		kiran.setPreferredProgrammingLanguage("C++");
		kiran.setDevelopedApplication("Command Prompt");
		
		kiran.display();
	}
}
