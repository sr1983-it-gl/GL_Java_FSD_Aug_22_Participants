
public class Application {

	private String name;
	private int version;
	
	public Application() {}
	
	public Application(String n, int v) {
		
		name = n;
		version = v;
	}
	
	public void setName(String n) {
		
		name = n;
	}
	
	public void setVersion(int v) {
		
		if (v <= 0) {
			System.out.println("Wrong version details...");
			System.out.println("This wrong version will not be accepted");
			
//			version = v;
		}else {

			version = v;			
		}
	}
	
	public void display() {
		
		System.out.println("Name is ->" + name);
		System.out.println("Version is ->" + version);
	}
}
