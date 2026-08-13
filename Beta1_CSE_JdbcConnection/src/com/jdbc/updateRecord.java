package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updateRecord {
    public static void main(String[] args)throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beta1cse","root","Vedhi.0931");

        Statement statement = con.createStatement();
        statement.executeUpdate("update student set name = 'Bender' where id=101");
        System.out.println("Update Record Suceess");
    }


}