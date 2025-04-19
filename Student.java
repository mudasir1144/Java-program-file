public class Student extends Person{
private String studentNumber;
private boolean marketing;

public Student(String pName, String pGender, int pAge, String studNum, boolean market){
super(pName, pAge, pGender);
studentNumber = studNum;
marketing = market;
}
public String getstudentNumber(){
return studentNumber;
}
public void setstudentNumber(String studNum){
studentNumber = studNum;
}
public boolean getmarketing(){
return marketing;
}
public void setmarketing(boolean market){
marketing = market;
}
}