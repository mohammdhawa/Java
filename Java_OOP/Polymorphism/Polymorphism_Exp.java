public class Employee_2 {
	
	private String name, address, department, email;
	private float salary;
	
	
	
	public Employee_2(String name, String address, String department, String email, float salary) {
		super();
		this.name = name;
		this.address = address;
		this.department = department;
		this.email = email;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}

public class DailyEmployee extends Employee_2 {
	
	private float workDayPrice;
	private int dailyRate;
	
	public DailyEmployee(String name, String address, String department, String email, float salary, float workDayPrice, int dailyRate) {
		super(name, address, department, email, salary);
		// TODO Auto-generated constructor stub
		this.workDayPrice = workDayPrice;
		this.dailyRate = dailyRate;
	}

	public float getWorkDayPrice() {
		return workDayPrice;
	}

	public void setWorkDayPrice(float workDayPrice) {
		this.workDayPrice = workDayPrice;
	}

	public int getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(int dailyRate) {
		this.dailyRate = dailyRate;
	}
	
	@Override 
	public float getSalary() {
		return workDayPrice*dailyRate;
	}

}

public class SalariedEmployee extends Employee_2 {
	
	float bouns;
	
	

	public SalariedEmployee(String name, String address, String department, String email, float salary, float bouns) {
		super(name, address, department, email, salary);
		// TODO Auto-generated constructor stub
		this.bouns = bouns;
	}

	public float getBouns() {
		return bouns;
	}

	public void setBouns(float bouns) {
		this.bouns = bouns;
	} 
	
	//////////////////////////////
	@Override
	public float getSalary() {
		return super.getSalary()+bouns;
	}

}

public class HourlyEmployee extends Employee_2 {
	
	private float workHourPrice;
	private int hourlyRate;
	
	public HourlyEmployee(String name, String address, String department, String email, float salary, float workHourPrice, int hourlyRate) {
		super(name, address, department, email, salary);
		// TODO Auto-generated constructor stub
		this.workHourPrice = workHourPrice;
		this.hourlyRate = hourlyRate;
	}

	public float getWorkHourPrice() {
		return workHourPrice;
	}

	public void setWorkHourPrice(float workHourPrice) {
		this.workHourPrice = workHourPrice;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public float getSalary() {
		return workHourPrice*hourlyRate;
	}

}

class Test {
	
	
	
	public static void main(String[] args) {
		
		
		Employee_2 e1 = new Employee_2("Mohammad", "Turkey", "IT", "mail.ru", 1000);
		
		System.out.println("Salary is: " + e1.getSalary());
		
		e1 = new SalariedEmployee("Mohammad", "Turkey", "IT", "mail.ru", 1000, 200);
		
		System.out.println("Salary is: " + e1.getSalary());
		 
	}		
}
