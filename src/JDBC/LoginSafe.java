package JDBC;

import java.sql.*;

public class LoginSafe {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/demo_db";
        String user = "root";
        String passwordDB = "admin1234";

        String username = "' OR '1'='1";  // attacker input
        String password = "anything";

        try {
            Connection con = DriverManager.getConnection(url, user, passwordDB);

            String query = "SELECT * FROM users WHERE username = ? AND password = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Login Success");
            } else {
                System.out.println("Login Failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}