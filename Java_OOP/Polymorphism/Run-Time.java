class Parent {
	
	void Print() {
		System.out.println("Parent class");
	}
	
}

class Subclass_1 extends Parent {
	
	void Print() {
		System.out.println("Subclass_1");
	}
	
}

class Subclass_2 extends Parent {
	
	void Print() {
		System.out.println("Subclass_2");
	}
}

public class Test {

	public static void main(String[] args) {
		
		Parent a = new Parent();
		a.Print();
		
		a = new Subclass_1();
		a.Print();
		
		a = new Subclass_2();
		a.Print();
		
		
		

	}

}
