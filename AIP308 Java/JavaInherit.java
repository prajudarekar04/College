/*
Create a Class Book with (title, author, number of pages and isbn number) implement
parametrized constructor to assign the data members. Create an a Class
ScientificBook which inherits Book and have area as a new data member,
ComicBook which inherits Book and have publisher name & price as a new data member,
access the data members and methods in derived class to implement the inheritance.
*/
class Book
{
	String Title;
	String author;
	int noOfPages;
	String ISBN;
	Book(String title, String aur, int num)
	{
		Title = title;
		author = aur;
		noOfPages = num;
		ISBN = "unknown";
	}
	Book(String title, String aur, int num, String isbn)
	{
		Title = title;
		author = aur;
		noOfPages = num;
		ISBN = isbn;
	}
	
}
class ScientificBook extends Book
{
	String area;
	ScientificBook(String title, String aur, int num, String isbn, String subject)
	{
		super( title, aur, num, isbn);
		area = subject;
	}
	public void displayInfo()
	{
		System.out.println("Book Information\nTitle of Book : " + Title + "\nAuthor : " + author + "\nNo. of Pages : " + noOfPages + "\nISBN No. : " + ISBN + "\nArea : " + area);
	}
}
class ComicBook extends Book
{
	String publisher;
	float price;
	ComicBook(String title, String aur, int num, String isbn, String company, float cost)
	{
		super( title, aur, num, isbn);
		publisher = company;
		price = cost;
	}
	public void displayInfo()
	{
		System.out.println("Book Information\nTitle of Book : " + Title + "\nAuthor : " + author + "\nNo. of Pages : " + noOfPages + "\nISBN No. : " + ISBN + "\nPublisher : " + publisher + "\nPrice : " + price);
	}
}
public class JavaInherit
{
	public static void main(String[] args)
	{
		ScientificBook sb = new ScientificBook("Cosmos", "Carl Sagan", 396, "978-0-345-53943-4", "Cosmology");
		ComicBook cb = new ComicBook("Chintoo", "Charuhas Pandit", 57, "168-759-436182", "Purandare Prakashan", 60);
		sb.displayInfo();
		cb.displayInfo();
	}
}
