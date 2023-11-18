import java.util.*;
public class Employee
{
	String FirstName;
	String LastName;
	double Salary;
	Employee()
	{
		FirstName = null;
		LastName = null;
		Salary = 0.0;
	}
	void SetFirst()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter First Name:");
		FirstName = sc.nextLine();
	}
	void SetLast()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Last Name:");
		LastName = sc.nextLine();
	}
	void SetSalary()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Salary:");
		Salary = sc.nextDouble();
	}
	String GetFirst() { return FirstName; }
	String GetLast() { return LastName; }
	double GetSalary() { return Salary; }
	void Display(double SalaryYear,double SalaryRised,double RisedSalaryNextYear)
	{
		System.out.println("\n" + FirstName.concat(" ").concat(LastName));
		System.out.println("Salary Per Month:" + Salary);
		System.out.println("Salary per Year:" + SalaryYear);
		System.out.println("Monthly Rised Salary in Next Year:" + SalaryRised);
		System.out.println("And Yearly:" + (SalaryRised*12));
	}
	double CalculateSalary()
	{
		double SalaryYear = (Salary * 12);
		return SalaryYear;
	}
	Double RiseSalary()
	{
		double RisedSalary = ((Salary *10)/100) + Salary;
		return RisedSalary;
	}
	public static void main(String []args)
	{
		Employee a = new Employee();
		Employee b = new Employee();
		double SalaryYear = 0.0;
		double SalaryRise = 0.0;
		double RisedSalaryNextYear = 0.0;
		a.SetFirst();
		a.SetLast();
		a.SetSalary();
		System.out.println("\nEnter data for Second Employee");
		b.SetFirst();
		b.SetLast();
		b.SetSalary();
		SalaryYear = a.CalculateSalary();
		SalaryRise = a.RiseSalary();
		a.Display(SalaryYear, SalaryRise,RisedSalaryNextYear);
		SalaryYear = b.CalculateSalary();
		SalaryRise = b.RiseSalary();
		b.Display(SalaryYear, SalaryRise,RisedSalaryNextYear);
	}
}