package biblioteca4;

import java.util.ArrayList;

public class Editorial {
	String name;
	String webPage;
	boolean status;	
	ArrayList<Article> articles =new ArrayList<Article>();	
	public Editorial(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWebPage() {
		return webPage;
	}
	public void setWebPage(String webPage) {
		this.webPage = webPage;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public boolean addArticle(Article article) {
		if(articles.contains(article)) {
			return false;
		}else {
			this.articles.add(article);
			return true;
		}
	}	
	
	public void clearBooks() {
		this.articles.clear();
	}	
	
	public boolean searchBooks(String code) {
		for(int i=0;i<articles.size();i++) {
			if(articles.get(i).getCode().equals(code)) {
				return true;
			}
		}
		return false;
	}
	public ArrayList<Article> getArticles() {
		return articles;
	}
	
	public void printArticles() {
		for(int i=0;i<articles.size();i++) {
			System.out.println("Código : " + articles.get(i).getCode());
			System.out.println("Título : " + articles.get(i).getTitle());
			System.out.println("Páginas : " + articles.get(i).getPages());			
			System.out.println("Editorial : " + this.getName());		
		}
		
	}
	
	
}
