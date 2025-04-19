public class Lecturer extends Person{
private String employeeNumber;
private String Nlnumber;
private String jobTitle;
private double salary;

public Lecturer(String pName, String pGender, int pAge, String empNum, String nl, String job, double sal){
super(pName, pAge, pGender);
employeeNumber = empNum;
Nlnumber = nl;
jobTitle = job;
salary = sal;
}
public String getemployeeNumber(){
return employeeNumber;
}
public void setemployeeNumber(String empNum){
employeeNumber = empNum;
}
public String getNlnumber(){
return Nlnumber;
}
public void setNlnumber(String nl){
Nlnumber = nl;
}
public String getjobTitle(){
return jobTitle;
}
public void setjobTitle(String job){
jobTitle = job;
}
public double getsalary(){
return salary;
}
public void setsalary(double sal){
salary = sal;
}
}
