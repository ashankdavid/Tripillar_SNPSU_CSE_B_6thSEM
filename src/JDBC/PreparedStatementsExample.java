package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementsExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test_db";
        String user = "root";
        String pass = "admin1234";

        try{
            Connection con = DriverManager.getConnection(url, user, pass);
            String query = "INSERT INTO students (usn, name, age) VALUES (?,?,?)";
            // creating the prepared statements
            PreparedStatement ps = con.prepareStatement(query);
            // setting the values
            ps.setInt(1, 104);
            ps.setString(2, "Dhruv");
            ps.setInt(3, 29);
            System.out.println("Row got Inserted Successfully!");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
