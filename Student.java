public class Student extends Person{
	private String studentNumber;
	private boolean marketing;

public Student(String name , String gender , int age , String studentNumber , boolean marketing){
	super(name,age,gender);
	this.studentNumber = studentNumber;
	this.marketing = marketing;
}
public String getstudentNumber(){
	return studentNumber;
}
public void setstudentNumber(String studentNumber){
	this.studentNumber = studentNumber;
}
public boolean getmarketing(){
	return marketing;
}
public void setmarketing(boolean marketing){
	this.marketing = marketing;
}
}