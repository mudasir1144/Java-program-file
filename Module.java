public class Module {
	private String modulename;
	private String lectureVenue;
	private String dayOfWeek;
	private String time;
	private Lecturer lecturer;

public Module(String modulename , String lectureVenue , String dayOfWeek , String time , Lecturer lecturer){
	this.modulename = modulename;
	this.lectureVenue = lectureVenue;
	this.dayOfWeek = dayOfWeek;
	this.time = time;
	this.lecturer =  lecturer;
}
public String getmodulename(){
	return modulename;
}
public void setmodulename(String modulename){
	this.modulename = modulename;
}
public String getlectureVenue(){
	return lectureVenue;
}
public void setlectureVenue(String lectureVenue){
	this.lectureVenue = lectureVenue;
}
public String getdayOfWeek(){
	return dayOfWeek;
}
public void setdayOfWeek(String dayOfWeek){
	this.dayOfWeek = dayOfWeek;
}
public String gettime(){
	return time;
}
public void settime(String time){
	this.time = time;
}
public Lecturer getlecturer(){
	return lecturer;
}
public void setlecturer(Lecturer lecturer){
	this.lecturer = lecturer;
}
}