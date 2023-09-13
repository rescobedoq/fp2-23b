import java.util.*;
public class IMC {
  public static void main (String args []){
    Scanner sc = new Scanner (System.in);
    double peso, estatura;
    System.out.println("Ingrese peso:");
    peso = sc.nextDouble();
    System.out.println("Ingrese estatura:");
    estatura = sc.nextDouble();
    double imc = peso/(Math.pow(estatura,2));
    if (imc <= 18.5){
      System.out.println("bajo peso: "+imc);
    }else  
    if(imc <= 24.9){
      System.out.println("peso normal: "+ imc);
    }else
    if(imc <= 29.9){
      System.out.println("sobrepeso: " + imc);
    }else{
      System.out.println("Obesidad: " + imc);
    }

  }
}
