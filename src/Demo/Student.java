package Demo;

public class Student {
    private String name;
    private int usn;

    Student(String name, int usn){
        this.name = name;
        this.usn = usn;
    }

    String getName(){
        return name;
    }

    int getUsn(){
        return usn;
    }

    void setName(String name){
        this.name = name;
    }

    void setUsn(int usn){
        this.usn = usn;
    }

    void printDetail(){
        System.out.println("Student name " + this.name);
        System.out.println("Student USN " + this.usn);
    }


}

class Driver{
    public static void main(String[] args) {
        Student s1 = new Student("Ashank", 123);
        s1.printDetail();
        System.out.println(s1.getName());
        System.out.println(s1.getUsn());
        s1.setName("David");
    }
}
