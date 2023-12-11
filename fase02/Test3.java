import java.util.ArrayList;

class Bicycle3{
  int id;
  String color;
  String brand;
  double price;
  String model;
  boolean status;
  Bicycle3(String color,String brand, int id, double price, String model, boolean status){
    this.color = color;
    this.brand = brand;
    this.id = id;
    this.price = price;
    this.model = model;
    this.status = status;
  }
  int getId(){
    return this.id;
  }
  }

  class Owner3{
    String name;
    int dni;
    public ArrayList<Bicycle3> misBicis;
    
    Owner3(String n, int dni)
    {
      name = n;
      this.dni = dni;
      this.misBicis = new ArrayList<Bicycle3>();
    }
    String getName(){
      return name;
    }
    public void addBicycle(Bicycle3 bici){
    	this.misBicis.add(bici);
    }
    public ArrayList<Bicycle3> getBicycle(){
    	return this.misBicis;
    }
  }
  class Test3{
   public static void main(String[] args){
    Owner3 ricardo = new Owner3("Ricardo", 12345);
    Bicycle3 bici = new Bicycle3("rojo", "Generica", 17, 2.5, "Mountanier", true);
    Bicycle3 bici2 = new Bicycle3("rojo", "Generica", 18, 2.5, "Mountanier", true);
    ricardo.addBicycle(bici);
    ricardo.addBicycle(bici2);
    System.out.println("El propietario " + ricardo.getName() + ", tiene las bicicletas : ");
    ArrayList<Bicycle3> tmp = ricardo.getBicycle();
    System.out.println("TAM : " + tmp.size());
    for(int i=0; i<tmp.size(); i++){
    	System.out.println(i + "\t" + tmp.get(i).getId());
    }
   }
  }
