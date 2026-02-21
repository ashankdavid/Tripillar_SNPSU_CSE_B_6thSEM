package OOPs.Encapsulation;

public class Student {
    private String name;
    private int usn;

    Student(String name, int usn){
        this.name = name;
        this.usn = usn;
    }

    String getName(){
        return this.name;
    }

    void setName(String name){
        this.name = name;
    }

    int getUSN(){
        return this.usn;
    }

    void setUSN(int usn){
        this.usn = usn;
    }

    void printDetails(){
        System.out.println("Student name is: " + this.name);
        System.out.println("Student USN is: " + this.usn);
    }

}

class Driver{
    public static void main(String[] args) {
        Student s1 = new Student("Ashank", 123);
        s1.printDetails();
        System.out.println("name is " + s1.getName());
        s1.setName("David");
        System.out.println("name is " + s1.getName());

    }
}
