package biblioteca3;

public class Article {
	String code;
	String title;
	int pages;
	Editorial editorial;
	
	public Article(String code, String title) {
		this.code = code;
		this.title = title;
	}

	public Article(String code, String title, int pages, Editorial editorial) {
		this.code = code;
		this.title = title;
		this.pages = pages;
		this.editorial = editorial;
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

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
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
