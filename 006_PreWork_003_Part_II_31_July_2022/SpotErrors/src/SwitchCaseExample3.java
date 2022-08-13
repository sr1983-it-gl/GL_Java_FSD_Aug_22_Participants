
public class SwitchCaseExample3 {
	
	public static void main(String[] args) {
		
		String qualification = "BTech";
		
		switch (qualification) {
			case "BE" :
				System.out.println("UG Degree in Engineering - B.E");
				break;
				
			case "BTech" :
				System.out.println("UG Degree in Engineering - B.Tech");
				
			case "ME" :
				System.out.println("PG Degree - in Engineering - M.E");
				break;
				
			case "MTech" :
				System.out.println("PostGraduate in Engineering - M.Tech");
				break;
				
			default:
				System.out.println("Qualification not matching any of the conditions");
				break;
				
		}
	}
}
