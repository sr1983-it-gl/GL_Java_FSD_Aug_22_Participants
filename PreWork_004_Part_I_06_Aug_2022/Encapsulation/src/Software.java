
public class Software {

	private String name;
	private String version;
	
	void setName(String name) {
		
		if (name == null || name.isEmpty()) {
			System.out.println("Provide right values for name...");
		}
		
//		if (this typeof VirusObject) {
//			// Block method calls
//		}else {
//			
//		}
		
		this.name = name;
	}

	void setVersion(String version) {
		
		if (version == null || version.isEmpty()) {
			System.out.println("Provide correct values for version...");
		}
		
		this.version = version;
	}
	
	void display() {
		
		System.out.println("Name is " + name);
		System.out.println("Version is " + version);
	}

}
