public class Tiempo{

	public static void main(String args[]){
		System.out.println("Tiempo");

    long inicio = System.nanoTime();
    for(int i=1;i<=100;i++){

		System.out.println(i);
    }
    long total = System.nanoTime() - inicio;

    System.out.println("TOTAL (ns) : " + total);

	}

}
