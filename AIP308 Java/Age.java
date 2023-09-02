import java.util.*;

class Age
{
	Age() {}
	static int age(int curr, int year)
	{
		return (curr - year);
	}
	public static void main(String [] args)
	{
		int curr = 2023;
		Scanner read = new Scanner(System.in);
		System.out.println("Enter Name :");
		String name = read.nextLine();	// String input
		System.out.println("Enter BirthYear :");
		int year = read.nextInt();
		System.out.println("Age : "+ age(curr,year));
	}
}
