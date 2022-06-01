public class Animal {
	
	private String name;
	private double height;
	private int weight;
	private String favFood;
	private double speed;
	private String sound;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getFavFood() {
		return favFood;
	}
	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	///////////////////////////////////////////////////
	public Flys flyingType;
	
	public String tryToFly() {
		return flyingType.fly();
	}
	
	public void setFlyingAbility(Flys newFlyType) {
		flyingType = newFlyType;
	}

}

//////////////////////////////////////////////////////////////////

class Dog extends Animal {
	
	public void digHello() {
		System.out.println("Dug a Hole");
	}
	
	public Dog() {
		setSound("Bark");
		
		flyingType = new CantFly();
	}
	
}

///////////////////////////////////////////////////////////////////

class Bird extends Animal {
	
	public Bird() {
		setSound("Tweet");
		
		flyingType = new ItFlys();
	}
}

///////////////////////////////////////////////////////////////
public interface Flys {
	public String fly();
}

class ItFlys implements Flys {
	
	public String fly() {
		return "Flying Hight";
	}
	
}

class CantFly implements Flys {
	
	public String fly() {
		return "I can't fly";
	}
	
}

/////////////////////////////////////////////////////////////////
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal sparky = new Dog();
		
		Animal tweety = new Bird();
		
		System.out.println("Dog: " + sparky.tryToFly());
		System.out.println("Bird: "+ tweety.tryToFly());

	}

}

