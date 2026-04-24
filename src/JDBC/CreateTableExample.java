package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test_db";
        String user = "root";
        String pass = "admin1234";

        try{
            // creating connection
            Connection con = DriverManager.getConnection(url, user, pass);

            Statement stmt = con.createStatement();

            String query = "CREATE TABLE students(usn INT PRIMARY KEY, name VARCHAR(50), age INT NOT NULL)";

            stmt.executeUpdate(query);

            System.out.println("Table Created Successfully!");

            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
