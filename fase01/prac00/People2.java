import javax.swing.*;

public class People2{

	public static void main(String args[]){
    Persona[] agenda= new Persona[5];
    String n;
    boolean g;
    int i = 0;
    do{

    n = JOptionPane.showInputDialog(null,"Ingresar nombre");
    if(!n.equals("q")){

    g = Boolean.parseBoolean(JOptionPane.showInputDialog(null,"Ingresar genero"));
    agenda[i] = new Persona(n);
    agenda[i].setGender(g);
    i++;
    }
    }while(!n.equals("q"));
		System.out.println("Total: "+agenda.length+"personas");
	  for (i = 0; i < agenda.length; i++){
      System.out.println("Nombre: " + agenda[i].getName() + "\t" + agenda[i].getGender());
    }
  }

}
