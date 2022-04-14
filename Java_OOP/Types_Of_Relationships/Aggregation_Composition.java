
public class PersonelInfo {
	
	private String firstName;
	private String lastName;
	private String accountNumber;
	private String nationality;
	private int yearOfBirth;
	
	public PersonelInfo() {
		
	}

	public PersonelInfo(String firstName, String lastName, String accountNumber, String nationality, int yearOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.nationality = nationality;
		this.yearOfBirth = yearOfBirth;
	}
	
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	@Override
	public String toString() {
		return "PersonelInfo [firstName=" + firstName + ", lastName=" + lastName + ", accountNumber=" + accountNumber
				+ ", nationality=" + nationality + ", yearOfBirth=" + yearOfBirth + "]";
	}

}

public class Department {
	
	private int deptNo;
	private String deptName;
	
	public Department() {
		
	}

	public Department(int deptNo, String deptName) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + "]";
	}

}

public class Employee {
	
	private int id;
	private float salary;
	private PersonelInfo personelInfo;
	private Department dept;
	
	public Employee(int id, float salary, String fName, String lName, String acountNo, String nationality, int yearOfBirth, Department dept) {
		this.id = id;
		this.salary = salary;
		//this.personelInfo = personelInfo; // this for aggregation
		this.personelInfo = new PersonelInfo(fName, lName, acountNo, nationality, yearOfBirth); // this for composition
		this.dept = dept;	// aggregation
	}

	@Override
	public String toString() {
		return "Employee: \nid=" + id + "\nsalary=" + salary + "\npersonelInfo=" + personelInfo + "\ndept=" + dept;
	}
	
}

public class Test {
	
	public static void main(String[] args) {
		
		Department dept = new Department(123, "IT");
		
		Employee emp1 = new Employee(190290, 4500, "Mohammad", "Hawa", "@mail.ru", "Syrian", 1999, dept);
		Employee emp2 = new Employee(190290, 4500, "Mohammad", "Hawa", "@mail.ru", "Syrian", 1999, dept);
		Employee emp3 = new Employee(190290, 4500, "Mohammad", "Hawa", "@mail.ru", "Syrian", 1999, dept);
		
		System.out.println(emp1);
		
	}

}
