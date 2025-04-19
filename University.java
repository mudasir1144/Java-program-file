public class University{
private String uniname;
private Address address;
public University(String uniName, Address addr){
uniname = uniName;
address = addr;
}
public String getuniname(){
return uniname;
}
public void setuniname(String uniName){
uniname = uniName;
}
public Address getaddress(){
return address;
}
public void setaddress(Address addr){
address = addr;
}
}