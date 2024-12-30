public class Student extends Person {
    private String group;

    public Student(String name, String group) {
        super(name);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{name='" + getName() + "', group='" + group + "'}";
    }
}
