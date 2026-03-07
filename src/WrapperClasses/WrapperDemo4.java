package WrapperClasses;
// one of the Best Reasons why we use wrapper classes
public class WrapperDemo4 {
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str); // string --> int
        System.out.println(num + 10);
    }
}
