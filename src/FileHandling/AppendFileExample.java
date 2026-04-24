package FileHandling;

import java.io.FileWriter;

public class AppendFileExample {
    public static void main(String[] args) {
        try{
            // step 1 turn on append mode
            FileWriter writer = new FileWriter("Student.txt", true);

            // step 2 write the data into the file
            writer.write("\nNew Line Added!");

            writer.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
