//Program for implementation of Constructor-Set-Get_Method for Employee Class
/*
Write a program to develop class employee with constructor to initialize instance variables.
Provide Set method and Get method for instance variables.
Also provide a method to raise Salary of each employee by 10%.
*/
//Not completed yet
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
		System.out.println("First Name : ");
		firstName = sc.nextLine();
	}
	void setLast()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Last Name : ");
		lastName = sc.nextLine();
	}
	void setSalaray()
	{
		
	}
	String getFirst()
	{
		return firstName;
	}
	String getLast()
	{
		return lastName;
	}
	double getSalaray()
	{
		return salary;
	}
	public static void main(String[]args)
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
	}
}
