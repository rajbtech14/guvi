package com.oops;

public class Employee extends person {
	
	int EmployeeID ;
	double Salary;
	
	public Employee (String name, int age, int EmployeeID,double salary)
	{
		super (name,age);
		this.EmployeeID = EmployeeID;
		this.Salary = salary;
	}

	public void displayinfo() {
		super.display();
		System.out.println("EmpID  : " + EmployeeID);
		System.out.println("Salary : " + Salary);
		
	}
	public static void main(String[] args) {
		Employee emp = new Employee("Raja", 30, 10122, 50000);
		emp.displayinfo();
	}
}


