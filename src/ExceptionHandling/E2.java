package ExceptionHandling;

public class E2 {
    public static void main(String[] args) {
        int i, j, k=0;
        i=10;
        j=2;
        try{
            k=i/j;
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[10]);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Hello");
    }
}
