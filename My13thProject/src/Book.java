
public class Book {
	private static int ISBN;
	String title;
	String author;
	int isbn;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.isbn = Book.ISBN;
		Book.ISBN++;
		
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public static void setISBN(int isbn)
	{
		ISBN = isbn;
	}
	
	public static void main(String[] args) {
		Book javaBook = new Book("JAVA JDK", "황기태");

	}

}
