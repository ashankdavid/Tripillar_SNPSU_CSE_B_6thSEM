package FileHandling;

import java.io.File;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        try{
            // step 1 open file
            File file = new File("Student.txt");

            // step 2 Read the File
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()){
                String line = sc.nextLine(); // rad the line
                System.out.println((line));
            }

            sc.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
