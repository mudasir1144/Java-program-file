public class Address{
	private int streetNumber;
	private String cityorcountry;
	private String addresslines;
	private String postcode;
	private String country;
 public Address(int streetNumber , String cityorcountry , String addresslines , String postcode , String country){
	this.streetNumber = streetNumber;
	this.cityorcountry = cityorcountry;
	this.addresslines = addresslines;
	this.postcode = postcode;
	this.country = country;
}
public int getstreetNumber(){
	return streetNumber;
}
public void setstreetNumber(int streetNumber){
	this.streetNumber = streetNumber;
}
public String getcityorcountry(){
	return cityorcountry;
}
public void setcityorcountry(String cityorcountry){
	this.cityorcountry = cityorcountry;
}
public String getaddresslines(){
	return addresslines;
}
public void setaddresslines(String addresslines){
	this.addresslines = addresslines;
}
public String getpostcode(){
	return postcode;
}
public void setpostcode(String postcode){
	this.postcode = postcode;
}
public String getcountry(){
	return country;
}
public void setcountry(String country){
	this.country = country;
}
}