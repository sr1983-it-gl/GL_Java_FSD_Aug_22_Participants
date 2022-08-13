
public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		
		Programmer shunmuga = new Programmer();
		
		shunmuga.setName("Shunmuga");
		shunmuga.setPreferredProgrammingLanguage("Java");
		
		shunmuga.display();

		ApplicationProgrammer john = 
				new ApplicationProgrammer();
			
		john.setName("John");
		john.setPreferredProgrammingLanguage("Java Script");		
		john.setDevelopedApplication("Google Chrome");
		
		john.display();
		
		System.out.println("----------------");
		SystemProgrammer divya = new SystemProgrammer();
		divya.setName("Divya");
		divya.setPreferredProgrammingLanguage("Python");
		
		divya.setHasNetworkProgrammingSkills(true);
		divya.setDeviceDriversProgrammingSkills(false);
		
		divya.display();
		
	}
}
