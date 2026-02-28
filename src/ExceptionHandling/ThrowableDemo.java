package ExceptionHandling;

public class ThrowableDemo {
    static void function() throws Throwable{
        throw new Throwable("Something went Wrong");
    }
    public static void main(String[] args) {
        try{
            function();
        }catch (Throwable t){
            System.out.println(t.getMessage());
        }
    }
}

/*
Allowed:
throw new Exception("Message")
throw new RuntimeException("Message")
throw new Throwable("Message")

Not Allowed: X
throw new String X
throw new Integer X
 */