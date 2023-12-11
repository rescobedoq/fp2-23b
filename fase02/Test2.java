import java.util.*;

class Bicycle2{
  int id;
  String color;
  String brand;
  double price;
  String model;
  boolean status;
  Owner owner;
  Bicycle2(String color,String brand, int id, double price, String model, boolean status){
    this.color = color;
    this.brand = brand;
    this.price = price;
    this.model = model;
    this.status = status;
    this.owner = owner;
  }
  int getId(){
    return id;
  }
  }
  class Owner{
    String name;
    int dni;
    Bicycle2[] misBicis;
    Owner(String n, int dni)
    {
      name = n;
      this.dni = dni;
      Bicycle2[] misBicis = new Bicycle2[1];
    }
    String getName(){
      return name;
    }
    void addBicycle(Bicycle2 bici){
    	int tm = misBicis.length;
	misBicis[tm] = bici;
    }
    Bicycle2[] getBicycle(){
    	return misBicis;
    }
  }
  class Test2{
   public static void main(String[] args){
    Owner ricardo = new Owner("Ricardo", 12345);
    Bicycle2 bici = new Bicycle2("rojo", "Generica", 001, 2.5, "Mountanier", true);
    ricardo.addBicycle(bici);
    System.out.println("El propietario " + ricardo.getName() + ", tiene las bicicetas : ");
    Bicycle2[] tmp = ricardo.getBicycle();
    for(int i=0; i<tmp.length; i++){
    	System.out.println(i + "\t" + tmp[i].getId());
    }
   }
  }

