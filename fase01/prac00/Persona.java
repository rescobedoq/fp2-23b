public class Persona{
  String name;
  int age;
  boolean gender;

  public Persona(String a){
    this.name = a;
  }
  public void setAge(int b){
    this.age = b;
  }
  
  public void setGender(boolean c){
    this.gender = c;
  }

  public String getName(){
    return this.name;
  }
  
  public String getGender(){
    return (this.gender)?"Masculino":"Femenino";
  }
}
