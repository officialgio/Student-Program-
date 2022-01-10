package Project;

/**
 * For a class to be immutable
 * – All data fields must be private.
 * – There can’t be any mutator methods (setters) for data fields.
 * – No getter method can return a reference to a data field that is mutable.
 *
 * Cannot Change student id/name because class is immutable
 *
 * By: Giovanny Hernandez
 *
 */

final public class Student {

    // nobody changes id/name with final keyword once initialized!
    final private int id;
    final private String studentName;
    final private Address address;
    final private StudentClasses classes;

    // constructor
    public Student(int id, String studentName, Address address, StudentClasses classes) {
        this.id = id;
        this.studentName = studentName;
        this.address = address;
        this.classes = classes;
    }
    //getter
    public int getId() {
        return id;
    }
    public Address getAddress() {
        return new Address(address.getCity(), address.getState());
    }
    /*final*/
//    //setter
//    public void setId(int id) {
//        this.id = id;
//    }
    //getter
    public String getStudentName() {
        return studentName;
    }
    /*final*/
//    //setter
//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", address=" + address +
                ", classes=" + classes +
                '}';
    }
}
