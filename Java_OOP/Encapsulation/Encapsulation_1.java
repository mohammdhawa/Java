class Encapsulate {
	
	private String geekName;
	private int geekRoll;
	private int geekAge;
	
	public int getAge() {
		return geekAge;
	}
	
	public String getName() {
		return geekName;
	}
	
	public int getRoll() {
		return geekRoll;
	}
	
	public void setAge(int newAge) {
		geekAge = newAge;
	}
	
	public void setRoll(int newRoll) {
		geekRoll = newRoll;
	}
	
	public void setName(String newName) {
		geekName = newName;
	}
}

public class Test {

	public static void main(String[] args) {
		
		Encapsulate obj = new Encapsulate();
		
		obj.setAge(23);
		obj.setName("Mohammad");
		obj.setRoll(50);
		
		System.out.println("Geek's name " + obj.getName());
		System.out.println("Geek's age " + obj.getAge());
		System.out.println("Geek's roll " + obj.getRoll());

	}

}
