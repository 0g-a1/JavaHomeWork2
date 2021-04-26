
public class Main {

	public static void main(String[] args) {
		
		Instructor instructorFirst = new Instructor(1,"Engin Demiroð");
				
		Instructor[] instructors= {instructorFirst};
		
		System.out.println("Eðitmenler" + "\n");
		for(Instructor instructor : instructors) {
			System.out.println(instructor.instructorName + "\n");
		}
		
		System.out.println("---------------------------------------------");
		
		Course course1 = new Course(1,"Yazýlým Geliþtirme Kampý (C# + ANGULAR)","Engin Demiroð");
		Course course2 = new Course(2,"Yazýlým Geliþtirme Kampý (JAVA + REACT)","Engin Demiroð");
				
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
