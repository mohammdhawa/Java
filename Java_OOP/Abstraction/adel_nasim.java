
public abstract class Car {
	
	private float height;
	private float weight;
	private int numberOfWheels;
	
	public Car() {
		
	}
	
	public Car(float height, float weight, int numberOfWheels) {
		super();
		this.height = height;
		this.weight = weight;
		this.numberOfWheels = numberOfWheels;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	abstract void autopiolt();
	
	abstract void streamingServices();
	
	abstract void parkingSensors();
}


public class HatchBack extends Car {

	@Override
	void autopiolt() {
		System.out.println("HatchBack autopilot");
	}

	@Override
	void streamingServices() {
		System.out.println("HatchBack streamingServices");
	}

	@Override
	void parkingSensors() {
		System.out.println("HatchBack parkingSensors");
	}
	
	

}

public class SUV extends Car {
	
	private int x;
	
	

	public SUV(int x, float height, float weight, int numberOfWheels) {
		super(height, weight, numberOfWheels);
		this.x = x;
	}

	@Override
	void autopiolt() {
		System.out.println("SUV autopilot");
	}

	@Override
	void streamingServices() {
		System.out.println("SUV streamingServices");
	}

	@Override
	void parkingSensors() {
		System.out.println("SUV parkingSensors");
	}

}


public class Test {

	public static void main(String[] args) {
		
		SUV suv = new SUV(5, 220f, 91.7f, 4);
		
		suv.autopiolt();
		suv.parkingSensors();
		suv.streamingServices();
		
	}

}
