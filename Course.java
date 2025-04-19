public class Course{
private String coursename;
private String department;
private int durationInYear;
private Lecturer lecturer;
private Student[] students;
private Course[] course;

public Course(String cName, String dept, int duration, Lecturer lect, Student[] studs, Course[] courses){
coursename = cName;
department = dept;
durationInYear = duration;
lecturer = lect;
students = studs;
course = courses;
}
public String getcoursename(){
return coursename;
}
public void setcoursename(String cName){
coursename = cName;
}
public String getdepartment(){
return department;
}
public void setdepartment(String dept){
department = dept;
}
public int getdurationInYear(){
return durationInYear;
}
public void setdurationInYear(int duration){
durationInYear = duration;
}
public Lecturer getlecturer(){
return lecturer;
}
public void lecturer(Lecturer lect){
lecturer = lect;
}
public Student[] getstudents(){
return students;
}
public void setstudent(Student[] studs){
students = studs;
}
public Course[] getcourse(){
return course;
}
public void setcourse(Course[] courses){
course = courses;
}
}