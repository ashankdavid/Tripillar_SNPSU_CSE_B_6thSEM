package Strings;

public class StringOperationsDemo {
    public static void main(String[] args) {
        // Created Strings
        String s1 = "Java Programming";
        String s2 = new String("Java Programming");

        System.out.println("Original String: " + s1);

        // length()
        System.out.println("Length is: " + s1.length());

        // charAt()
        System.out.println("Charcter at index 2: " + s1.charAt(2));

        // toUpperCase() and toLowerCase()
        System.out.println("UPPERCASE: " + s1.toUpperCase());
        System.out.println("lowercase: " + s1.toLowerCase());

        // equals() and ==
        System.out.println("using == :" + s1==s2);
        System.out.println("using equals(): " + s1.equals(s2));

        // compareTo()
        System.out.println("using compareTo(): " + s1.compareTo(s2));

        // substring()
        System.out.println("Substring (0 to 4): " + s1.substring(0,4));

        //contain()
        System.out.println("Contains 'Program: " + s1.contains("Program"));

        //indexOf()
        System.out.println("Index of 'a': " + s1.indexOf('a') );

        // replace()
        System.out.println("Replace Java with Python: " + s1.replace("Java", "Python"));

        // startWith() and endWith()
        System.out.println("Starts with Java: " + s1.startsWith("Java"));
        System.out.println("Ends with mming: " + s1.endsWith("mming"));

        // trim()
        String s3 = "     Ashank           ";
        System.out.println("Before Trim: " + s3);
        System.out.println("Afyter Trim: " + s3.trim());

        //concat()
        System.out.println("Concat(): " + s1.concat(" Language"));

        //isEmpty()
        String str = "";
        System.out.println("Is Empty?: " + str.isEmpty());

        // Split()
        String sentence = "Java is a very easy Language to learn!";
        String[] arr = sentence.split(" ");
        System.out.println("After Split!");
        for(String i : arr){
            System.out.println(i);
        }
    }
}
