public class Lecturer extends Person{
	private String employeeNumber;
	private String Nlnumber;
	private String jobTitle;
	private double salary;

public Lecturer(String name , String gender , int age , String employeeNumber , String Nlnumber , String jobTitle , double salary){
	super(name , age , gender);
	this.employeeNumber = employeeNumber;
	this.Nlnumber = Nlnumber;
	this.jobTitle = jobTitle;
	this.salary = salary;
}
public String getemployeeNumber(){
	return employeeNumber;
}
public void setemployeeNumber(String employeeNumber){
	this.employeeNumber = employeeNumber;
}
public String getNlnumber(){
	return Nlnumber;
}
public void setNlnumber(String Nlnumber){
	this.Nlnumber = Nlnumber;
}
public String getjobTitle(){
	return jobTitle;
}
public void setjobTitle(String jobTitle){
	this.jobTitle = jobTitle;
}
public double getsalary(){
	return salary;
}
public void setsalary(double salary){
	this.salary = salary;
}
}