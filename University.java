public class University{
	private String uniname;
	private Address address;

public University(String uniname , Address address){
	this.uniname = uniname;
	this.address = address;
}
public String getuniname(){
	return uniname;
}
public void setuniname(String uniname){
	this.uniname = uniname;
}
public Address getaddress(){
	return address;
}
public void setaddress(Address address){
	this.address=address;
}
}