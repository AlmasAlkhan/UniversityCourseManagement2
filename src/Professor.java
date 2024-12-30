import java.util.ArrayList;
import java.util.List;

public class Professor extends Person {
    private boolean available;
    private List<Student> students;

    public Professor(String name) {
        super(name);
        this.available = true;
        this.students = new ArrayList<>();
    }

    public boolean isAvailable() {
        return available;
    }

    public void assignStudent(Student student) {
        if (available) {
            students.add(student);
            if (students.size() >= 1) { // Limit of 1 student per professor
                available = false;
            }
        }
    }
}
