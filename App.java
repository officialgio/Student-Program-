package Project;

public class App {
    public static void main(String[] args) {

        Address homeAdress = new Address("Chicago", "Illinois");
        Student Giovanny = new Student(1, "Giovanny Hernandez", homeAdress);

        System.out.println(Giovanny);
    }
}
