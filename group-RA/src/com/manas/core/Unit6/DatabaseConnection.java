package com.manas.core.Unit6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseConnection {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String password = "password";
        String sql = "CREATE TABLE table_2 (" +
                "id INT PRIMARY KEY AUTO_INCREMENT, " +
                "name VARCHAR(50), " +
                "age INT" +
                ")";
        try (Connection conn = DriverManager.getConnection(url, user, password)){
            System.out.println("Connected to the database");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
