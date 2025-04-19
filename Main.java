public class Main{
	public static void main(String[] args){
		Address uniaddress = new Address(1, "Lahore", "Township", "54000", "Pakistan");
		
		University myuni = new University("Minhaj Univeristy", uniaddress);
		Lecturer teacher = new Lecturer("Hasham Haider", "Male", 42, "E111", "Nl100", "Professor", 80000);
		Student student1 = new Student("Mudassir", "Male", 22, "001", false);
		Student student2 = new Student("Hamid", "Male", 22, "003", false);
		Student[] studentlist = {student1, student2};
		Module javamodule = new Module("Java programming", "Room no 6402", "Tuesday", "10.30 Am", teacher);
		Course[] courselist = new Course[1];
		Course CScourse = new Course("Mobile app development", "Computer Science", 4, teacher, studentlist, courselist);
		courselist[0] = CScourse;
		
		System.out.println("University: " + myuni.getuniname());
		System.out.println("Location: " + myuni.getaddress().getcityorcountry());
		System.out.println("\nCourse: " + CScourse.getcoursename());
		System.out.println("Lecturer: " + CScourse.getlecturer().getname());
		System.out.println("Students: ");
			for (Student s : studentlist){
				System.out.println("- " + s.getname() + " (" + s.getstudentNumber() + ")");
		}
		System.out.println("Module: " + javamodule.getmodulename());
		System.out.println("Day: " + javamodule.getdayOfWeek() + ", Time: " + javamodule.gettime());
	}
}