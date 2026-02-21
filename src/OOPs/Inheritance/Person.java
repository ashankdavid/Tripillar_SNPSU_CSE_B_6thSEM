package OOPs.Inheritance;

public class Person {
    String Fname;
    String Lname;

    Person(String Fname, String Lname){
        this.Fname =Fname;
        this.Lname = Lname;
    }
}

class Student extends Person{
    int usn;
    Student(String Fname, String Lname, int usn){
        super(Fname, Lname); // calling parent constructor here
        this.usn = usn;
    }
}

class Driver{
    public static void main(String[] args) {
        Student s1 = new Student("Ashank", "David", 123);
    }
}
