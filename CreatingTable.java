
import java.sql.*;
public class CreatingTable {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/student_db";
        String user = "root";
        String password = "Millennium123*";

        try(Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement()){

            String sql = "CREATING TABLE students (" +
                    "Index INT PRIMARY KEY AUTO_INCREMENT," +
                    "Name VARCHAR(50)," + "Marks DECIMAL(3,2)," + "Course(50),"+
                    "Age INT)";

            stmt.executeUpdate(sql);
            System.out.println("Table created successfully");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

