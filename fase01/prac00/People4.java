import javax.swing.*;

public class People4{

	public static void main(String args[]){
    Persona3[] agenda= new Persona3[5];
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
    agenda[j] = new Persona3(n);
    System.out.println(g);
    switch(String.valueOf(g)){
      case "Masculino": agenda[j].setGender("M");
                        break;
      case "Femenino": agenda[j].setGender("F");
                        break;
      default: agenda[j].setGender(null);
    }
    
    n = JOptionPane.showInputDialog(null,"Ingresar celular");
    agenda[j].setCellphone(n);
    j++;
    }
    }while(!n.equals("q"));
		System.out.println("Total: "+agenda.length+"personas");
	  for (i = 0; i < j; i++){
      System.out.println("Nombre: " + agenda[i].getName() + "\t" + agenda[i].getGender());
    }

    String x = JOptionPane.showInputDialog(null,"Ingresar celular");
    for(i = 0; i < agenda.length; i++ ){
      if ((agenda[i].getCellphone()).equals(x) ){
        System.out.println(agenda[i].getName() );
      }
    }
  }

}
