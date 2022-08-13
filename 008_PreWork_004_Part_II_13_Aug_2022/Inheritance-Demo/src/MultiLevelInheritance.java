
public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		C objC = new C();
		objC.print();
	}
}

class A {
	
	void print() {
		System.out.println("A.print");
	}
}

class B extends A {
	void print() {
		super.print();
		System.out.println("B.print");
	}
	
}

class C extends B {
	void print() {
		
		super.print();
		System.out.println("C.print");
	}
	
}