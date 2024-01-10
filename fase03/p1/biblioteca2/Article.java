package biblioteca2;

public class Article {
	String code;
	String title;
	int pages;
	
	
	public Article(String code, String title) {
		super();
		this.code = code;
		this.title = title;
	}

	public Article(String title) {
		this.title = title;
	}
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}	
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}	
	
}
