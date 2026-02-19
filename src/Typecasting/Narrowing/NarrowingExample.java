package Typecasting.Narrowing;

public class NarrowingExample {
    public static void main(String[] args) {
        short a = 300;
        byte b = (byte)a;
        System.out.println(a);
        System.out.println(b);
    }
}
