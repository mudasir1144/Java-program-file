public class Course{
	private String coursename;
	private String department;
	private int durationInYear;
	private Lecturer lecturer;
	private Student[] students;
	private Course[] course;

public Course(String coursename , String department , int durationInYear , Lecturer lecturer , Student[] students , Course[] course){
	this.coursename = coursename;
	this.lecturer = lecturer;
	this.department = department;
	this.durationInYear = durationInYear;
	this.students = students;
	this.course = course;
}
public String getcoursename(){
	return coursename;
}
public void setcoursename(String coursename){
	this.coursename = coursename;
}
public String getdepartment(){
	return department;
}
public void setdepartment(String department){
	this.department = department;
}
public int getdurationInYear(){
	return durationInYear;
}
public void setdurationInYear(int dirationInYear){
	this.durationInYear = durationInYear;
}
public Lecturer getlecturer(){
	return lecturer;
}
public void lecturer(Lecturer lecturer){
	this.lecturer = lecturer;
}
public Student[] getstudents(){
	return students;
}
public void setstudent(Student[] students){
	this.students = students;
}
public Course[] getcourse(){
	return course;
}
public void setcourse(Course[] course){
	this.course = course;
}
}