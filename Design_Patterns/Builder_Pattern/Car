import java.util.LinkedList;
import java.util.List;

public class Product {
	
	private List<String>parts;
	
	public Product() {
		parts = new LinkedList<String>();
	}
	
	public void add(String part) {
		parts.add(part);
	}
	
	public void show() {
		System.out.println("Product components are: ");
		for(String item : parts) {
			System.out.println(item);
		}
	}

}

///////////////////////////////////////////////////////////////////

interface IBuilder {
	
	public void StartUpOperations();
	
	public void BuildBody();
	
	public void InsertWheels();
	
	public void AddHeadLights();
	
	public void EndOperations();
	
	public void show();
	
	public Product getVehicle();
	
}

class Car implements IBuilder {
	
	private String brandName;
	private Product product;
	
	public Car(String brand) {
		product = new Product();
		brandName = brand;
	}
	
	public void StartUpOperations() {
		product.add("Car Model name: " + this.brandName);
	}
	
	public void BuildBody() {
		product.add("Build body of the car");
	}
	
	public void InsertWheels() {
		product.add("Insert wheels to the car");
	}
	
	public void AddHeadLights() {
		product.add("Insert head lights to the car");
	}
	
	public void EndOperations() {
		//product.add("The build of the car is completed");
	}
	
	public void show() {
		product.show();
	}
	
	public Product getVehicle() {
		return product;
	}
}

class Motor implements IBuilder {
	
	private String brandName;
	private Product product;
	
	public Motor(String brand) {
		product = new Product();
		brandName = brand;
	}
	
	public void StartUpOperations() {
		product.add("Motor Model name: " + this.brandName);
	}
	
	public void BuildBody() {
		product.add("Build body of the motor");
	}
	
	public void InsertWheels() {
		product.add("Insert wheels to the motor");
	}
	
	public void AddHeadLights() {
		product.add("Insert head lights to the motor");
	}
	
	public void EndOperations() {
		//product.add("The build of the car is completed");
	}
	
	public void show() {
		product.show();
	}
	
	
	public Product getVehicle() {
		return product;
	}
	
}

///////////////////////////////////////////////////////////

class Director {
	
	private IBuilder builder;
	
	public void construct(IBuilder builder) {
		this.builder = builder;
		
		builder.StartUpOperations();
		builder.BuildBody();
		builder.InsertWheels();
		builder.AddHeadLights();
		builder.EndOperations();
	}
	
}

//////////////////////////////////////////////////////////////////

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Director dr = new Director();
		
		IBuilder car = new Car("BMW CAR");
		
		IBuilder motor = new Motor("YAMAHA MOTOR");
		
		dr.construct(car);
		
		dr.construct(motor);
		
		car.show();
		
		System.out.println("\n--------------------\n");
		
		motor.show();
		
		

	}

}
