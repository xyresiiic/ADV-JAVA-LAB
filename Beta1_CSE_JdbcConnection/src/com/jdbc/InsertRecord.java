package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {
    public static void main(String[] args)throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beta1cse","root","pass");

        Statement statement = con.createStatement();
        statement.executeUpdate("insert into student values(105,'Nidhi')");
        System.out.println("Insert Record Suceess");
    }


}
