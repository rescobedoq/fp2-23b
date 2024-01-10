package biblioteca4;

public class Book extends Article {
	String ISBN;
	
	
	public Book(String title) {
		super(title);
		super.setType((byte) 1);
	}
	
	public Book(String code, String title, int pages) {
		super(code,title,pages);
		super.setType((byte) 1);
	}
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	
}
