//Program for implementation of Constructor-Set-Get_Method for Employee Class
/*
Write a program to develop class employee with constructor to initialize instance variables.
Provide Set method and Get method for instance variables.
Also provide a method to raise Salary of each employee by 10%.
*/
import java.util.*;	//for Scanner class
public class Employee
{
	String firstName;
	String lastName;
	double salary;
	Employee()
	{
		firstName = null;
		lastName = null;
		salary = 0.0;
	}
	Employee(String fnm, String lnm, double income)
	{
		firstName = fnm;
		lastName = lnm;
		salary = income;
	}
	void setFirst()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nFirst Name : ");
		firstName = sc.nextLine();
	}
	void setLast()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Last Name : ");
		lastName = sc.nextLine();
	}
	void setSalary()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Salary : ");
		salary = sc.nextDouble();
	}
	double CalculateSalary()
	{
		double SalaryYear = (salary * 12);
		return SalaryYear;
	}
	Double RiseSalary()
	{
		double RisedSalary = ((salary *10)/100)+salary;
		salary = RisedSalary;
		return RisedSalary;
	}
	String getFirst()
	{
		return firstName;
	}
	String getLast()
	{
		return lastName;
	}
	double getSalary()
	{
		return salary;
	}
	public static void main(String[]args)
	{
		Employee e1 = new Employee("Rajesh", "Wagle", 45000);
		System.out.println("\nFor First Employee : " + "\nName : " + e1.getFirst() + " " + e1.getLast());
		System.out.println("Salary : " + e1.getSalary() + "\nAnnual Income : " + e1.CalculateSalary() +"\nRised Salary after a yr. : " + e1.RiseSalary());
		
		Employee e2 = new Employee();
		e2.setFirst();	e2.setLast();	e2.setSalary();
		System.out.println("\nFor Second Employee : " + "\nName : " + e2.getFirst() + " " + e2.getLast());
		System.out.println("Salary : " + e2.getSalary() + "\nAnnual Income : " + e2.CalculateSalary() +"\nRised Salary after a yr. : " + e2.RiseSalary());
	}
}
