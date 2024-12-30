import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private List<Professor> professors;

    public Course(String name) {
        this.name = name;
        this.professors = new ArrayList<>();
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public String getName() {
        return name;
    }

    public void displayProfessors() {
        System.out.println("Available Professors for " + name + ":");
        for (int i = 0; i < professors.size(); i++) {
            System.out.println((i + 1) + ". " + professors.get(i).getName() + 
                    (professors.get(i).isAvailable() ? " (Available)" : " (Full)"));
        }
    }
}
