public class Person{
	private String name;
	private int age;
	private String gender;
	private Address address;
 
public Person(String name , int age , String gender){
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.address = address;
}
public String getname(){
	return name;
}
public void setname(String name){
	this.name = name;
}
public int getage(){
	return age;
}
public void setage(int age){
	this.age = age;
}
public String getgender(){
	return gender;
}
public void setgender(String gender){
	this.gender = gender;
}
public Address getaddress(){
	return address;
}
public void setaddress(Address address){	
	this.address = address ;
}
}