public class Module{
private String modulename;
private String lectureVenue;
private String dayOfWeek;
private String time;
private Lecturer lecturer;

public Module(String mName, String venue, String day, String mTime, Lecturer lect){
modulename = mName;
lectureVenue = venue;
dayOfWeek = day;
time = mTime;
lecturer = lect;
}
public String getmodulename(){
return modulename;
}
public void setmodulename(String mName){
modulename = mName;
}
public String getlectureVenue(){
return lectureVenue;
}
public void setlectureVenue(String venue){
lectureVenue = venue;
}
public String getdayOfWeek(){
return dayOfWeek;
}
public void setdayOfWeek(String day){
dayOfWeek = day;
}
public String gettime(){
return time;
}
public void settime(String mTime){
time = mTime;
}
public Lecturer getlecturer(){
return lecturer;
}
public void setlecturer(Lecturer lect){
lecturer = lect;
}
}