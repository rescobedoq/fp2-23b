public class Persona2{
  String name;
  int age;
  String gender;

  public Persona2(String a){
    this.name = a;
  }
  public void setAge(int b){
    this.age = b;
  }
  
  public void setGender(String c){
     this.gender = c;
  }

  public String getName(){
    return this.name;
  }
  
  public String getGender(){
    if(gender == null)
      return "-";
    if(this.gender.equals("M"))return "Masculino";
    if(this.gender.equals("F"))return "Femenino";
    return "-";
  }
}
