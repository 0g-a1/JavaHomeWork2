
public class CourseManager {

	public void addCourse(Course course) {
		System.out.println(course.courseName + " kursu eklendi.");
	}
	
	public void deletCourse(Course course) {
		System.out.println(course.courseName + " kursu silindi.");
	}
	
	public void updateCourse(Course course) {
		System.out.println(course.courseName + " kursu güncellendi.");
	}
}
