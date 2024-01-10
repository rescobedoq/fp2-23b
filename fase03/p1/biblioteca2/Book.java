package biblioteca2;

public class Book extends Article {
	String ISBN;
	
	
	public Book(String title) {
		super(title);
	}	
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	
}
