import java.sql.*;

public class insert {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/student_db";
        String user = "root";
        String password = "Millennium123*";

        try(Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement()){

            String sql = "INSERT INTO students (Name, Marks,Course,Age) VALUES "
                    + "('Kamal', 65,'Statistics',22), "
                    + "('Amal', 100,'Maths',21), "
                    + "('Nimal', 46,'IT',21)";
            int rows= stmt.executeUpdate(sql);

            System.out.println(" "+rows+ "records inserted");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}