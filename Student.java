package Project;

/**
 * Immutable Class
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

    // constructor
    public Student(int id, String studentName, Address address) {
        this.id = id;
        this.studentName = studentName;
        this.address = address;
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
                '}';
    }
}
