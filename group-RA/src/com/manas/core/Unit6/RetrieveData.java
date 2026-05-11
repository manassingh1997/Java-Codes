package com.manas.core.Unit6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveData {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String password = "password";
        String sql1 = "SELECT * FROM table_3";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet res = stmt.executeQuery(sql1)) {
            while (res.next()) {
                System.out.println("ID: "
                        + res.getInt("id") + ", Name: "
                        + res.getString("name") +
                        ", Age: " + res.getInt("age"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
