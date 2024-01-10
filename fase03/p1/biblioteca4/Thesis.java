package biblioteca4;

public class Thesis extends Article {
	
	
	public Thesis(String title) {
		super(title);
		super.setType((byte) 2);
	}
	
	public Thesis(String code, String title, int pages) {
		super(code,title,pages);
		super.setType((byte) 2);
	}
	
	
}
