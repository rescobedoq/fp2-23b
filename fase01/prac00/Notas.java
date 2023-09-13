public class Notas{
  public static void main(String args[]){
    double ex1 = Double.parseDouble(args [0]);
    double ev1 = Double.parseDouble(args [1]);
    double ex2 = Double.parseDouble(args [2]);
    double ev2 = Double.parseDouble(args [3]);
    double ex3 = Double.parseDouble(args [4]);
    double ev3 = Double.parseDouble(args [5]);
      double promedio = 0.05*ex1+0.05*ev1+0.15*ex2+0.15*ev2+0.2*ex3+0.4*ev3;
      System.out.print("Su promedio es: " + promedio);
  }
}
