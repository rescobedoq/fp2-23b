public class Monedas{

	public static void main(String args[]){
		System.out.println("Monedas");
    int i, moneda1, moneda2, moneda3, total;
    int[] frecuencia = new int[4];
    for(i = 0 ; i < 10 ; i++){
      total = 0;
      moneda1 = (int) (Math.random()*2);
      moneda2 = (int) (Math.random()*2);
      moneda3 = (int) (Math.random()*2);
      total = moneda1 + moneda2 + moneda3;
      frecuencia[total]++;
	}
  for(i=0 ; i < frecuencia.length ; i++){
    System.out.println(i + " caras: " + frecuencia[i]);
  }
  }
}
