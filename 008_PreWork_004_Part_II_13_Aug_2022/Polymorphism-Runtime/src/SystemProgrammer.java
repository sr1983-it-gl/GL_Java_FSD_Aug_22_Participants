
public class SystemProgrammer extends Programmer {

	boolean networkProgrammingSkills;
	boolean deviceDriversProgrammingSkills;
	
	void setHasNetworkProgrammingSkills(
		boolean networkProgrammingSkills) {
	
		this.networkProgrammingSkills = 
				networkProgrammingSkills;
	}
	
	
	void setDeviceDriversProgrammingSkills(
		boolean deviceDriversProgrammingSkills) {
		
		this.deviceDriversProgrammingSkills
			= deviceDriversProgrammingSkills;
	}
	
	public void display() {
		
		super.display();
		
		System.out.println("Networking programming skills " 
				+ networkProgrammingSkills);
		System.out.println("Device Driver Skills "
				+ deviceDriversProgrammingSkills);
	}
	
}
