

public class Employee {
	
	private String name;
	private String email;
	private String phone;
	private String department;
	private String address;
	private int yearOfBirth;
	private float salary;
	
	public Employee() {
		System.out.println("No parameter constructor");
	}
	public Employee(String name, String email, String phone, String department, String address, int yearOfBirth,
			float salary) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.department = department;
		this.address = address;
		this.yearOfBirth = yearOfBirth;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	

}

public class Accountant extends Employee {
	
	private String dailyInverntory;
	
	public Accountant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Accountant(String dailyInverntory) {
		super();
		this.dailyInverntory = dailyInverntory;
	}

	public Accountant(String name, String email, String phone, String department, String address, int yearOfBirth,
			float salary, String dailyInverntory) {
		super(name, email, phone, department, address, yearOfBirth, salary);
		// TODO Auto-generated constructor stub
		this.dailyInverntory = dailyInverntory;
	}


	public String getDailyInverntory() {
		return dailyInverntory;
	}

	public void setDailyInverntory(String dailyInverntory) {
		this.dailyInverntory = dailyInverntory;
	}
	
	
	
}

public class Developer extends Employee {
	
	private String projectName;
	
	public Developer() {
		System.out.println("Sub-Class Dev");
	}
	public Developer(String projectName) {
		super();
		this.projectName = projectName;
	}	
	public Developer(String name, String email, String phone, String department, String address, int yearOfBirth,
			float salary, String projectName) {
		super(name, email, phone, department, address, yearOfBirth, salary);
		this.projectName = projectName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
}


public class Supplier extends Employee {
	
	private String city;
	
	

	public Supplier(String city) {
		super();
		this.city = city;
	}
	

	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Supplier(String name, String email, String phone, String department, String address, int yearOfBirth,
			float salary, String ciy) {
		super(name, email, phone, department, address, yearOfBirth, salary);
		// TODO Auto-generated constructor stub
		this.city = city;
	}


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}
