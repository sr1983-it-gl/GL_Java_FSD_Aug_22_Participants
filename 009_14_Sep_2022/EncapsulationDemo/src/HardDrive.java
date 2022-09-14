
public class HardDrive {

	public String manufacturerName;
	public int capacityInTB;
	
	void upgrade() {
		
		capacityInTB = capacityInTB + 100;
	}
	
	
	void display() {
		
		System.out.println("Manufacture Name ->" + manufacturerName);
		System.out.println("Capacitity in TB is ->" + capacityInTB);
	}
}
