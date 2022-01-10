package Project;

public class StudentClasses {
    private String Classes;

    public String getClasses() {
        return Classes;
    }
    StudentClasses (String Classes) {
        this.Classes = Classes;
    }

    @Override
    public String toString() {
        return "StudentClasses{" +
                "Classes='" + Classes + '\'' +
                '}';
    }
}
