
public class SwitchCaseExample4 {
	
	public static void main(String[] args) {
		
		String foodPreference = "veg";
		
		switch (foodPreference) {
			case "veg" :
				System.out.println("Vegetarian food");
								
			case "egglesscakes" :
				System.out.println("Eggless food");
				break;
				
			case "nonveg" :
				System.out.println("Non Vegetarian food");
				
			case "nuts" :
				System.out.println("Healthy Snacks");
				break;
				
			default:
				System.out.println("Can't categorise properly with the given input");
				break;
				
		}
	}
}
