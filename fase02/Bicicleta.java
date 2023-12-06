import java.util.*;

class Bicycle{
  int id;
  String color;
  String brand;
  double price;
  String model;
  boolean status;
  Owner owner;
  Bicycle(String color,String brand, int id, double price, String model, boolean status, Owner owner){
    this.color = color;
    this.brand = brand;
    this.price = price;
    this.model = model
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
    Owner(String n, int dni)
    {
      name = n;
      this.dni = dni;
    }
    String getName(){
      return name;
    }
  }
  class Main{
   public static void main(String[] args){
    Owner ricardo = new Owner("Ricardo", 12345);
    Bicycle bici = new Bicycle("rojo", "Generica", 001, 2.5, "Mountanier", true, ricardo);
    System.out.println("El propietario de la bicicleta " + bici.getId + ", es " + ricardo.getName());
   }
  }
}
