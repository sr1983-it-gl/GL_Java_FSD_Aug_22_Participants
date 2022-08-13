import programmer.Programmer;

public class ApplicationProgrammer extends Programmer{

	String developedApplication;
	
	void setDevelopedApplication(String developedApplication) {
		
		this.developedApplication = developedApplication;
	}
	
	public void display() {
		
		super.display();
		
		// Gain access for name
		
		System.out.println("Name is " + name);
		
		System.out.println("Developed Application is " 
				+ developedApplication);
	}
}
