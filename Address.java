public class Address{
    private int streetNumber;
    private String cityorcountry;
    private String addresslines;
    private String postcode;
    private String country;
    
    public Address(int strNumber, String city, String addrLines, String pcode, String ctry){
        streetNumber = strNumber;     
        cityorcountry = city;
        addresslines = addrLines;
        postcode = pcode;
        country = ctry;
}   
public int getstreetNumber(){
return streetNumber;
}   
public void setstreetNumber(int strNumber){
streetNumber = strNumber;
}   
public String getcityorcountry(){
return cityorcountry;
}    
public void setcityorcountry(String city){
cityorcountry = city;
} 
public String getaddresslines(){
return addresslines;
}  
public void setaddresslines(String addrLines){
addresslines = addrLines;
}  
public String getpostcode(){
return postcode;
}   
public void setpostcode(String pcode){
postcode = pcode;
}    
public String getcountry(){
return country;
}    
public void setcountry(String ctry){
country = ctry;
}
}