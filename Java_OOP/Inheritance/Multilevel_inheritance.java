class One {
	
	public void print_geek() {
		System.out.println("Geek");
	}
	
}

class Two extends One {
	
	public void print_for() {
		System.out.println("for");
	}
	
}

class Three extends Two {
	
	public void print_geeks() {
		System.out.println("Geeks");
	}
}

public class Test {

	public static void main(String[] args) {
		
		Three g = new Three();
		g.print_geek();
		g.print_for();
		g.print_geeks();

	}

}
