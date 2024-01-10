package biblioteca3;

public class Main {

	public static void main(String[] args) {
		
		Editorial e1 = new Editorial("UNIVERSIDAD");
		Book b1 = new Book("BOOK-PROG-01", "Fundamentos de Programación", 358, e1);
		b1.setISBN(null);
		
		System.out.println("Código : " + b1.getCode());
		System.out.println("Título : " + b1.getTitle());
		System.out.println("Páginas : " + b1.getPages());
		System.out.println("Editorial : " + b1.getEditorial().name);		

	}

}


