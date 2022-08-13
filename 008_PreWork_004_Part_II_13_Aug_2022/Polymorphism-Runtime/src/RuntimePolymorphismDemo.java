
public class RuntimePolymorphismDemo {

	public static void main(String[] args) {
			
		Programmer base1 = new Programmer();
		base1.setName("P1");
		base1.display();
		
		System.out.println("------------------");
		ApplicationProgrammer child1 = new ApplicationProgrammer();
		child1.setName("P2");
		child1.display();
		
		System.out.println("-------------------");
		SystemProgrammer child2 = new SystemProgrammer();
		child2.setName("P3");
		child2.display();
	
		System.out.println("------------------");
		Programmer base2 = null;
		
		String userOption = "1";
		if (userOption.equals("1")) {
			base2 = child1;					
		}else{
			base2 = child2;
		}
		
		base2.display();
		
//		base2 = child2;
		
//		child1 = base2;
//		child2 = base2;
	}
}
