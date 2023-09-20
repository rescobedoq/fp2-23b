public class Persona3{
  String name;
  int age;
  String gender;
  String cellphone ;

  public Persona3(String a){
    this.name = a;
  }
  public void setAge(int b){
    this.age = b;
  }
  
  public void setCellphone(String b){
    this.cellphone = b;
  }
  public String  getCellphone(){
    return this.cellphone ;
  }
  public void setGender(String c){
    this.gender = c;
  }
  
  public String getName(){
    return this.name;
  }
  
  public String getGender(){
    if(this.gender.equals("M"))return "Masculino";
    if(this.gender.equals("F"))return "Femenino";
    if(this.gender.equals(null))return "-";
    return "-";
  }
}
