
public class EncapsulationWithoutInformationHiding {

	public static void main(String[] args) {
		
		HardDrive moviesHD = new HardDrive();
		
		moviesHD.manufacturerName = "Western Digital";
		moviesHD.capacityInTB = 500;
		
		moviesHD.display();
		
		moviesHD.upgrade();
	
		moviesHD.display();
		
		moviesHD.capacityInTB = -100;
		moviesHD.capacityInTB = 0;
		
		moviesHD.display();
	}
}
