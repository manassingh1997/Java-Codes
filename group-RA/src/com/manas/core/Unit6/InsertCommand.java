package com.manas.core.Unit6;

import java.sql.*;

public class InsertCommand {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String password = "password";
        String sql = "INSERT INTO table_3 (id, name, age) VALUES (?, ?, ?)";

        try(Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1,101);
            pstmt.setString(2,"Alice");
            pstmt.setInt(3,45);

            int rowsInserted = pstmt.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
