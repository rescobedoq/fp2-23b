package biblioteca4;

public class Journal extends Article {
	
	public Journal(String title) {
		super(title);
		super.setType((byte) 3);
	}
	
	public Journal(String code, String title, int pages) {
		super(code,title,pages);
		super.setType((byte) 3);
	}
	
}
