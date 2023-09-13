import java.util.*;
class Notas3{
  public static void main(String args[]){
   double[] percents = new double[6];
   percents[0] = 0.05;
   percents[1] = 0.05;
   percents[2] = 0.15;
   percents[3] = 0.15;
   percents[4] = 0.20;
   percents[5] = 0.40;
   Scanner sc = new Scanner(System.in);
   char keyboard = 'a';
   String student;
   double note = 0;
   double average = 0 ;
   do{
    
    System.out.println("Ingrese nombre del alumno: ");
    student = sc.nextLine();
    System.out.println("Ingrese nota 1: ");
    note = sc.nextInt();
    average = note*percents[0];
    System.out.println("Ingrese nota 2: ");
    note = sc.nextInt();
    average += note*percents[1];
    System.out.println("Ingrese nota 3: ");
    note = sc.nextInt();
    average += note*percents[2];
    System.out.println("Ingrese nota 4: ");
    note = sc.nextInt();
    average += note*percents[3];
    
    System.out.println("Ingrese nota 5: ");
    note = sc.nextInt();
    average += note*percents[4];
    System.out.println("Ingrese nota 6: ");
    note = sc.nextInt();
    average += note*percents[5];
    System.out.println("Hola "+ student +" tu nota final es: " + average);
    System.out.println("Ingrese q para salir: ");
    keyboard = sc.next().charAt(0);
   }while (keyboard != 'q');
  }

}




