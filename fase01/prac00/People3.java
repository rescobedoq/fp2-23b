import javax.swing.*;

public class People3{

	public static void main(String args[]){
    Persona2[] agenda= new Persona2[5];
    String n;
    Object g;
    int i = 0,j=0;
    do{

    n = JOptionPane.showInputDialog(null,"Ingresar nombre");
    if(!n.equals("q")){
    g = JOptionPane.showInputDialog(null,"Seleccione genero",
    "COLORES", JOptionPane.QUESTION_MESSAGE, null,
    new Object[] { "Seleccione","Masculino", "Femenino"},"Seleccione");
   // g = Boolean.parseBoolean(JOptionPane.showInputDialog(null,"Ingresar genero"));
    agenda[j] = new Persona2(n);
    System.out.println(g);
    switch(String.valueOf(g)){
      case "Masculino": agenda[j].setGender("M");
                        break;
      case "Femenino": agenda[j].setGender("F");
                        break;
      default: agenda[j].setGender(null);
    }
    
    j++;
    }
    }while(!n.equals("q"));
		System.out.println("Total: "+agenda.length+"personas");
	  for (i = 0; i < j; i++){
      System.out.println("Nombre: " + agenda[i].getName() + "\t" + agenda[i].getGender());
    }
  }

}
