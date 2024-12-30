import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University university = new University("Astana ITUniversity");

        Course calculus = new Course("Calculus");
        Course oop = new Course("Object-Oriented Programming");
        Course introToProg = new Course("Introduction to Programming");
        Course politicalScience = new Course("Political Science");

        university.addCourse(calculus);
        university.addCourse(oop);
        university.addCourse(introToProg);
        university.addCourse(politicalScience);

        calculus.addProfessor(new Professor("Dr. Almas"));
        calculus.addProfessor(new Professor("Dr. Aslan"));
        calculus.addProfessor(new Professor("Dr. Ayadil"));

        oop.addProfessor(new Professor("Dr. Aldiyar"));
        oop.addProfessor(new Professor("Dr. Akbota"));
        oop.addProfessor(new Professor("Dr. Rafael"));

        introToProg.addProfessor(new Professor("Dr. Zhalgas"));
        introToProg.addProfessor(new Professor("Dr. Turar"));
        introToProg.addProfessor(new Professor("Dr. Lenara"));

        politicalScience.addProfessor(new Professor("Dr. Aizat"));
        politicalScience.addProfessor(new Professor("Dr. Aruana"));
        politicalScience.addProfessor(new Professor("Dr. Erasyl"));

        university.displayCourses();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the course number to select: ");
        int courseIndex = scanner.nextInt() - 1;

        if (courseIndex >= 0 && courseIndex < university.getCourses().size()) {
            Course selectedCourse = university.getCourses().get(courseIndex);
            selectedCourse.displayProfessors();

            System.out.println("Enter the professor number to select: ");
            int professorIndex = scanner.nextInt() - 1;

            if (professorIndex >= 0 && professorIndex < selectedCourse.getProfessors().size()) {
                Professor selectedProfessor = selectedCourse.getProfessors().get(professorIndex);

                if (selectedProfessor.isAvailable()) {
                    System.out.println("Enter your name: ");
                    scanner.nextLine();
                    String studentName = scanner.nextLine();

                    System.out.println("Enter your group: ");
                    String studentGroup = scanner.nextLine();

                    selectedProfessor.assignStudent(new Student(studentName, studentGroup));
                    System.out.println("You have successfully registered for " + selectedCourse.getName()
                            + " with " + selectedProfessor.getName());
                } else {
                    System.out.println("Sorry, this professor is already fully booked.");
                }
            } else {
                System.out.println("Invalid professor selection.");
            }
        } else {
            System.out.println("Invalid course selection.");
        }
        scanner.close();
    }
}
