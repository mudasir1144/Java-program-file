public class Person{
private String name;
private int age;
private String gender;
private Address address;
 
public Person(String pName, int pAge, String pGender){
name = pName;
age = pAge;
gender = pGender;
}
public String getname(){
return name;
}
public void setname(String pName){
name = pName;
}
public int getage(){
return age;
}
public void setage(int pAge){
age = pAge;
}
public String getgender(){
return gender;
}
public void setgender(String pGender){
gender = pGender;
}
public Address getaddress(){
return address;
}
public void setaddress(Address addr){	
address = addr;
}
}