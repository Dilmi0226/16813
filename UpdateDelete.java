
import java.sql.*;
public class updateDelete {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/student_db";
        String user = "root";
        String password = "Millennium123*";

        try(Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement()){

            String updateSql = "UPDATE students SET age=22 WHERE name='Nimal'";
            int update = stmt.executeUpdate(updateSql);
            System.out.println(" " + update + " record updated.");

            String deleteSql = "DELETE FROM students WHERE name='Kamal'";
            int deleted = stmt.executeUpdate(deleteSql);
            System.out.println(" " + deleted + " records deleted");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}