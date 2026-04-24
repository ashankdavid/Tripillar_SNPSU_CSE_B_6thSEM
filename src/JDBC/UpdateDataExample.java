package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateDataExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test_db";
        String user = "root";
        String pass = "admin1234";

        try{
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String query = "UPDATE students SET age=26 WHERE usn=101";
            stmt.executeUpdate(query);
            System.out.println("Row Updated Successfully!");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
