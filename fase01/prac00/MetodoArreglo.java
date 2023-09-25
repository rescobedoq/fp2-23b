public class MetodoArreglo{

	public static void main(String args[]){
		System.out.println("Hola mundo. FP2");
    int [] numeros = new int [100];
    for (int i = 0; i < 100; i++){
      numeros[i] = (int)(Math.random()*100 + 1);
    }
    int[] resultado = menor(numeros);
    System.out.println("El menor es: " + resultado[0] + " y esta en la posicion: " + resultado[1]);
	}
  public static int[] menor(int[] array){
    int[] menor = {array[0],0};
    for (int i = 1; i < array.length; i++){
      if (menor[0] > array[i]){
        menor[0] = array[i];
        menor[1] = i;
      }
    }
    return menor;
  }

}
