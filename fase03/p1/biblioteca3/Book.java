package biblioteca3;

public class Book extends Article {
	String ISBN;
	
	
	public Book(String title) {
		super(title);
	}
	
	public Book(String code, String title, int pages, Editorial editorial) {
		super(code,title,pages,editorial);
	}
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	
}
