package ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E4TryWithResources {
    public static void main(String[] args) throws Exception {
        String str;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter Something: ");
            str = br.readLine();
            System.out.println("You Entered!" + str);
        }
    }
}
