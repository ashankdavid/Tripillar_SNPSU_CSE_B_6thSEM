package OOPs.ConstructoeDemo;

class Student {
    String name;
    int usn;

    // Traditional Constructor!
    Student(String name, int usn){
        this.name = name;
        this.usn = usn;
    }

    // Copy Constructor
    Student(Student obj){
        this.name = obj.name;
        this.usn = obj.usn;
    }

    void display(){
        System.out.println(name + " " + usn);
    }
}

class Driver1{
    public static void main(String[] args) {
        Student s1 = new Student("Ashank", 123);
        Student s2 = new Student(s1);

        s1.display(); // Ashank 123
        s2.display(); // Ashank 123 (clone or copied)
    }
}
