import java.util.*;
public class Celulares{
  public static void main(String args[]){
    String [] cellphones = new String [100];
    int index = -1;
    char cont = 'g';
    Scanner sc = new Scanner(System.in);
    do{
     index++;
     System.out.println("Si desea salir, ingrese q");
     cont = sc.next().charAt(0);
    } while(index < 100 && cont != 'q' );
  }
}
