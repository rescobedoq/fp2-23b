public class Argumentos2{

	public static void main(String args[]){
    int numero;
    for(int i=0;i<args.length;i=i+1){
      numero = Integer.parseInt(args[i]);
		  System.out.println(numero*numero);
    }
	}

}
