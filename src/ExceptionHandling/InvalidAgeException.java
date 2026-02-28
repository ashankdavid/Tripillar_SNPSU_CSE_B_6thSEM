package ExceptionHandling;

public class InvalidAgeException extends Exception {
    InvalidAgeException(String msg){
        super(msg);
    }
}

class Driver{
    static void vote(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be over 18!");
        }
        System.out.println("You can Vote!");
    }
    public static void main(String[] args){
        try{
            vote(17);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}