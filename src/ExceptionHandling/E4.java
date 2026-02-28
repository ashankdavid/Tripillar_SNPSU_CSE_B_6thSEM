package ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E4 {
    public static void main(String[] args) throws Exception {
        String str;
        BufferedReader br = null;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Something: ");
            str = br.readLine();
            System.out.println("You Entered!" + str);
        }finally {
            br.close();
        }
    }
}
