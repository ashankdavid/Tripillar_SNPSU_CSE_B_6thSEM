package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteDataExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test_db";
        String user = "root";
        String pass = "admin1234";

        try{
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String query = "DELETE FROM students where usn=103";
            stmt.executeUpdate(query);
            System.out.println("Row Deleted Successfully!");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
