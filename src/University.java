import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Course> courses;

    public University(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void displayCourses() {
        System.out.println("Welcome to " + name);
        System.out.println("Available Courses:");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println((i + 1) + ". " + courses.get(i).getName());
        }
    }
}
