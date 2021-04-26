
public class Main {

	public static void main(String[] args) {
		
		Instructor instructorFirst = new Instructor(1,"Engin Demiro�");
				
		Instructor[] instructors= {instructorFirst};
		
		System.out.println("E�itmenler" + "\n");
		for(Instructor instructor : instructors) {
			System.out.println(instructor.instructorName + "\n");
		}
		
		System.out.println("---------------------------------------------");
		
		Course course1 = new Course(1,"Yaz�l�m Geli�tirme Kamp� (C# + ANGULAR)","Engin Demiro�");
		Course course2 = new Course(2,"Yaz�l�m Geli�tirme Kamp� (JAVA + REACT)","Engin Demiro�");
				
		Course[] courses= {course1,course2};
		
		System.out.println("Mevcut Kurslar" + "\n");
		for(Course course : courses) {
			System.out.println(course.courseName + "\n");
		}
		
		System.out.println("---------------------------------------------");
		
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.addCourse(course1);
		courseManager.updateCourse(course2);
		
	}

}
