
public class EncapsulationWithInformationHidingDemo {

	public static void main(String[] args) {
		
		Software eclipse = new Software();	

		eclipse.setName("Eclipse for Java Edition");	
		eclipse.setVersion("2022-03");
		eclipse.display();
		
		Software virusSoftware = new Software();	

		virusSoftware.setName("McAfee");	
		virusSoftware.setVersion("2022-03");
		virusSoftware.display();
		

		Software chrome = new Software();				
		chrome.setName("Google Chrome");		
		chrome.setVersion("100");
		chrome.display();
	}
}
