
public interface Moveable {
	
	void moveUp();
	void moveDown();
	void moveLeft();
	void moveRight();

}


public interface selfDrivable {
	
	void destination(String d);
	
	void drive();

}


public class CarV1 implements Moveable, selfDrivable {
	
	private int x, y;
	private int numberOfPasengers;
	
	public CarV1() {
	}

	public CarV1(int x, int y, int numberOfPasengers) {
		super();
		this.x = x;
		this.y = y;
		this.numberOfPasengers = numberOfPasengers;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getNumberOfPasengers() {
		return numberOfPasengers;
	}

	public void setNumberOfPasengers(int numberOfPasengers) {
		this.numberOfPasengers = numberOfPasengers;
	}

	@Override
	public void destination(String d) {
		System.out.println("Destination = " + d);	
	}

	@Override
	public void moveUp() {
		y--;
	}

	@Override
	public void moveDown() {
		y++;
	}

	@Override
	public void moveLeft() {
		x--;
	}

	@Override
	public void moveRight() {
		x++;
		
	}
	
	@Override 
	public void drive() {
		System.out.println("Drive V1");
	}

}

public class CarV2 implements Moveable, selfDrivable {
	
	private int x, y;
	private int numberOfPasengers;
	
	public CarV2() {
	}

	public CarV2(int x, int y, int numberOfPasengers) {
		super();
		this.x = x;
		this.y = y;
		this.numberOfPasengers = numberOfPasengers;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getNumberOfPasengers() {
		return numberOfPasengers;
	}

	public void setNumberOfPasengers(int numberOfPasengers) {
		this.numberOfPasengers = numberOfPasengers;
	}

	@Override
	public void destination(String d) {
		System.out.println("Destination = " + d);	
	}

	@Override
	public void moveUp() {
		y--;
	}

	@Override
	public void moveDown() {
		y++;
	}

	@Override
	public void moveLeft() {
		x--;
	}

	@Override
	public void moveRight() {
		x++;
		
	}
	
	@Override 
	public void drive() {
		System.out.println("Drive V2");
	}
	
}


public class Test {
	
	static void interfaceMethod(selfDrivable s) {
		s.drive();
	}

	public static void main(String[] args) {
		
		selfDrivable c1 = new CarV1();
		
		c1.drive();
		
		c1 = new CarV2();
		
		c1.drive();
		
		interfaceMethod(new CarV1());
		interfaceMethod(new CarV2());
		
	}

}
