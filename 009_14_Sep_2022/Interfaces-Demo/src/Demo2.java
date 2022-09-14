
public class Demo2 {

	public static void main(String[] args) {
		
		Bird2 bird1 = new Bird2();
		bird1.fly();
		
		System.out.println("-------");
		HumanBeing somePerson = new HumanBeing();
		somePerson.fly();

		System.out.println("-------");
		
		Flyable flayable = null;
				
		flayable = bird1;
		flayable.fly();

		System.out.println("-------");
		
		flayable = somePerson;
		flayable.fly();
				
		
//		Animal animal1 = new Animal();
//		flayable = animal1;
		System.out.println("-------");		
	}
	
	
}
