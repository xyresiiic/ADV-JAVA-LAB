package com.jdbc;

import java.sql.*;

public class SelectRecord {
    public static void main(String[] args)throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beta1cse","root","Vedhi.0931");

        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery("select * from student");
        while (rs.next()){
            System.out.println("Student Id = "+rs.getInt("id")+" Student Name = "+rs.getString("name"));
        }
    }


}