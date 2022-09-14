
public class EncapsulationWithInformationHiding {

	public static void main(String[] args) {
		
		Application javaApplication = new Application();
		
//		javaApplication.name = "Java";
		
		javaApplication.setName("Java");
		javaApplication.setVersion(17);
				
		javaApplication.display();
		
		javaApplication.setVersion(18);
		javaApplication.display();
		
		javaApplication.setVersion(-1);		
		javaApplication.display();
	
		
		Application chromeBrwoser = new Application(
			"Chrome Browser", 40);
		
		chromeBrwoser.setName("Google Chrome Browser");
		chromeBrwoser.setVersion(49);
	}
}
