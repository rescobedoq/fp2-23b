package biblioteca4;

public class Article {
	String code;
	String title;
	int pages;
	byte type;
	
	public Article(String code, String title) {
		this.code = code;
		this.title = title;
		this.type = 0;
	}

	public Article(String code, String title, int pages) {
		this.code = code;
		this.title = title;
		this.pages = pages;
		this.type = 0;
	}

	public Article(String title) {
		this.title = title;
		this.type = 0;
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

	public byte getType() {
		return type;
	}

	public void setType(byte type) {
		this.type = type;
	}
	
	
}
