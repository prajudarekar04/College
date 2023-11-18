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
		System.out.println("\nBook Information\nTitle of Book : " + Title + "\nAuthor : " + author + "\nNo. of Pages : " + noOfPages + "\nISBN No. : " + ISBN + "\nPublisher : " + publisher + "\nPrice : " + price);
	}
}
public class JavaInherit
{
	public static void main(String[] args)
	{
		ScientificBook sb = new ScientificBook("Cosmos", "Carl Sagan", 396, "978-0-345-53943-4", "Cosmology");
		sb.displayInfo();
		ComicBook cb = new ComicBook("Chintoo", "Charuhas Pandit", 57, "168-759-436182", "Purandare Prakashan", 60);
		cb.displayInfo();
	}
}
