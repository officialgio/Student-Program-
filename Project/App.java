package Project;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Introduction to Object-Oriented Programming
 * To start of this project will only contain the basic essential immutable/mutable classes, and a Data Structure
 *
 */
public class App {
    public static void main(String[] args) {

        /**
         * Simple Object Creation
         */
        Address homeAdress = new Address("Chicago", "Illinois");
        Address homeAdress2 = new Address("Chicago", "Illinois");
        Address homeAdress3 = new Address("Chicago", "Illinois");
        Address homeAdress4 = new Address("Chicago", "Illinois");

        StudentClasses classes = new StudentClasses("Calculus, Programming Fundamentals, Trigonometry");
        StudentClasses classes2 = new StudentClasses("Programming Fundamentals, Physics");
        StudentClasses classes3 = new StudentClasses("Programming Fundamentals, Art II, Advanced Literature, Algebra");
        StudentClasses classes4 = new StudentClasses("Advanced Art, Intro to Biology, Reading III");


        //Student Giovanny = new Student(1, "Giovanny Hernandez", homeAdress, classes);


        /**
         * Using HashMap to store Objects Name as key and their value with their information (id, address, etc)
         *
         * Big-O = O(1)
         *
         * *       Methods
         * *   ----------------
         * *   Add Items = put();
         * *   Access an Item = get();
         * *   Remove an item = remove();
         * *   Remove All = clear();
         * *   Size = size();
         * *   Loop = for-each loop
         *
         */
        HashMap<String, Student> map = new HashMap<>();
        map.put("Giovanny Hernandez", new Student(1, "Giovanny Hernandez", homeAdress, classes));
        map.put("Mike Zam", new Student(2, "Mike Zam", homeAdress2, classes2));
        map.put("Christian Diaz", new Student(3, "Christian Diaz", homeAdress3, classes3));
        map.put("Natalie Gail", new Student(4, "Natalie Gail", homeAdress4, classes4));
        //System.out.println(map.get("Giovanny Hernandez")); (only to print single key)

        /**
         * Print  all using keySet();
         */
        for (String key : map.keySet()) {
            System.out.println(key + "\t" + map.get(key));
        }






        //System.out.println(Giovanny);
    }
}
