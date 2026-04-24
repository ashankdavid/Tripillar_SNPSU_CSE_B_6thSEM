package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static void main(String[] args) {
        try{
            // Step 1 - Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2 - Create Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test_db",
                    "root",
                    "admin1234"
            );
            // testing the connection
            System.out.println("Connected Successfully!");

            // Step 3 - close the connection
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
