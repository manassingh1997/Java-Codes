package GroupRA.Unit_6;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection1 {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String password = "password";
        try (Connection conn = DriverManager.getConnection(url, user, password)){
            System.out.println("Connected to the database");
        } catch(Exception e){
            e.printStackTrace();
        }
//        String sql = "CREATE TABLE table_2 (" +
//                "id INT PRIMARY KEY AUTO_INCREMENT, " +
//                "name VARCHAR(50), " +
//                "age INT" +
//                ")";
//            Statement stmt = conn.createStatement();
//            stmt.executeUpdate(sql);
    }
}


