
public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		Printer hpPrinter = new Printer();
		hpPrinter.print();
		
		ColorPrinter myNewHPColorPrinter =  new ColorPrinter();
		myNewHPColorPrinter.print();
	}
}

class Printer{
	
	void print() {
		System.out.println("Printing some pages....");
	}
}


class ColorPrinter extends Printer{


	void print() {
		
		super.print();
		System.out.println("Own implementation");
	}


}
