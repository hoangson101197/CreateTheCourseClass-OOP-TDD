import org.junit.Test;

public class CourseTest {
    @Test
    public void testCourse() {
        Course course = new Course("javer");
        String andy = "andy";
        course.addStudent(andy);
        System.out.println(course.getName());
        System.out.println(course.getStudents());
        System.out.println(course.getStudentsCount());
    }

    @Test
    public void testdisplayCourse() {
        Course course = new Course("javer");
        course.displayCourse(course);
        String andy = "andy";
        course.addStudent(andy);
        course.displayCourse(course);
        String booby = "booby";
        course.addStudent(booby);
        course.displayCourse(course);
        String samy = "samy";
        course.addStudent(samy);
        course.displayCourse(course);
        course.removeStudent("andy");
        course.displayCourse(course);
    }

}