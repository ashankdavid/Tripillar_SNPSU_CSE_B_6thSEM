package Strings;

public class StringImmutable {
    public static void main(String[] args) {
        String str = "Hello";
        str.concat(" World");
        System.out.println(str);

        // correctly work with string
        str = str.concat(" World");
        System.out.println(str);
    }
}
