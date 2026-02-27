package Strings;

public class StringBuilderExample {

    public void stringAppend() {
        StringBuilder sb = new StringBuilder("Sapthagiri");
        System.out.println("Old String: " + sb);
        sb.append(" College");
        System.out.println("New String: " + sb);
    }

    public void stringInsert(){
        StringBuilder sb = new StringBuilder("JA");
        System.out.println("Before Insertion: " + sb);
        sb.insert(1, "AV");
        System.out.println("After Insertion: " + sb);
    }

    public void stringReverse(){
        StringBuilder sb = new StringBuilder("Sapthagiri");
        System.out.println("Before reversing: " + sb);
        sb.reverse();
        System.out.println("After reversing: " + sb);
    }

    // delete()
    public void stringDelete(){
        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println("Before Deletion: " + sb);
        sb.delete(5, 11);  // removes " World"
        System.out.println("After Deletion: " + sb);
    }

    // deleteCharAt()
    public void stringDeleteCharAt(){
        StringBuilder sb = new StringBuilder("JavaX");
        System.out.println("Before deleteCharAt: " + sb);
        sb.deleteCharAt(4); // removes X
        System.out.println("After deleteCharAt: " + sb);
    }

    // replace()
    public void stringReplace(){
        StringBuilder sb = new StringBuilder("Hello Java");
        System.out.println("Before Replace: " + sb);
        sb.replace(6, 10, "World");
        System.out.println("After Replace: " + sb);
    }

    // capacity()
    public void stringCapacity(){
        StringBuilder sb = new StringBuilder();
        System.out.println("Default Capacity: " + sb.capacity());

        sb.append("Hello");
        System.out.println("Capacity After Append: " + sb.capacity());
    }

    // length()
    public void stringLength(){
        StringBuilder sb = new StringBuilder("Programming");
        System.out.println("String: " + sb);
        System.out.println("Length: " + sb.length());
    }

    // charAt()
    public void stringCharAt(){
        StringBuilder sb = new StringBuilder("Java");
        System.out.println("Character at index 2: " + sb.charAt(2));
    }

    // setCharAt()
    public void stringSetCharAt(){
        StringBuilder sb = new StringBuilder("Jovo");
        System.out.println("Before setCharAt: " + sb);
        sb.setCharAt(2, 'v');
        System.out.println("After setCharAt: " + sb);
    }

    // substring()
    public void stringSubstring(){
        StringBuilder sb = new StringBuilder("HelloWorld");
        System.out.println("Substring (0,5): " + sb.substring(0,5));
    }

    public static void main(String[] args) {

        StringBuilderExample builderExample = new StringBuilderExample();

        builderExample.stringAppend();
        builderExample.stringInsert();
        builderExample.stringReverse();
        builderExample.stringDelete();
        builderExample.stringDeleteCharAt();
        builderExample.stringReplace();
        builderExample.stringCapacity();
        builderExample.stringLength();
        builderExample.stringCharAt();
        builderExample.stringSetCharAt();
        builderExample.stringSubstring();
    }
}