package OOPs.Basics.ClassWithAttributes;

public class Car {
    String BrandName;
    int ManuDate;
    String Color;

    public Car(String BrandName, int MDate, String C){
        this.BrandName = BrandName;
        ManuDate = MDate;
        Color = C;
    }

    void printDetails(){
        System.out.printf("Car BrandName is %s\n", this.BrandName);
        System.out.printf("Car ManuDate is %d\n", ManuDate);
        System.out.printf("Car Color is %s\n", Color);
    }
}

class Driver{
    public static void main(String[] args) {
        Car c1 = new Car("Audi", 2000, "Red");
        Car c2 = new Car("BMW", 1995, "Black");
        c1.printDetails();
        c2.printDetails();
        c1.BrandName = "Maruti";
        c1.printDetails();
    }
}
