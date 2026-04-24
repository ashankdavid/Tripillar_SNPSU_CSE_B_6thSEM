package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriterExample {
    public static void main(String[] args) {
        try{
            // Step 1 - create writer class obj and create file
            FileWriter writer = new FileWriter("Student.txt");

            // Write on that student.txt file
            writer.write("Hello Students\nWelcome to JAVA CLASS");

            // closing the writer class and release the resources
            writer.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
