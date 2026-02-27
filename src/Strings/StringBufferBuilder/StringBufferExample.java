package Strings.StringBufferBuilder;

public class StringBufferExample {
    public void stringAppend(){
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Old String: " + sb);
        sb.append(" World");
        System.out.println("New String: " + sb);
    }
    public void stringInsert(){
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Old String: " + sb);
        sb.insert(1, "EEE");
        System.out.println("New String: " + sb);
    }

    public void stringReverse(){
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Old String: " + sb);
        sb.reverse();
        System.out.println("New String: " + sb);
    }

    public static void main(String[] args) {
        StringBufferExample obj = new StringBufferExample();
        obj.stringAppend();
        obj.stringInsert();
        obj.stringReverse();
    }
}