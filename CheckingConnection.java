import java.sql.*;

public class CheckingConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student_db";
        String user = "root";
        String password = "Millennium123*";


        try {
            // 1. Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create a connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Database Connected Successfully! heloooo");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}