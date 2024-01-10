package biblioteca4;

public class Main {

	public static void main(String[] args) {
		
		Editorial e1 = new Editorial("UNIVERSIDAD");
		Book b1 = new Book("BOOK-PROG-01", "Fundamentos de Programación", 358);
		Book b2 = new Book("BOOK-ISOF-02", "Ingeniería de Software", 250);
		b2.setISBN("978-612-00-0855-3");
		Book b3 = new Book("BOOK-SISO-03", "Sistemas Operativos", 410);
		Thesis t1 = new Thesis("THESIS-ISIS-01", "Modelo de análisis del sentimiento en la Red Social Facebook usando Redes Neuronales", 118);
		Journal j1 = new Journal("JOURNAL-ISIS-01", "Revista de la Escuela Profesional de Ingeniería de Sistemas", 80);
		
		e1.printArticles();
		System.out.println((e1.addArticle(b1))?"Éxito":"Fracaso");
		System.out.println((e1.addArticle(b2))?"Éxito":"Fracaso");
		System.out.println((e1.addArticle(b3))?"Éxito":"Fracaso");
		System.out.println((e1.addArticle(b3))?"Éxito":"Fracaso");
		System.out.println((e1.addArticle(t1))?"Éxito":"Fracaso");
		System.out.println((e1.addArticle(j1))?"Éxito":"Fracaso");
		e1.printArticles();
	

	}

}
