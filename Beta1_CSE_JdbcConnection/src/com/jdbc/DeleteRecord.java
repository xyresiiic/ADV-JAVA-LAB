package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {
    public static void main(String[] args)throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beta1cse","root","pass");

        Statement statement = con.createStatement();
        statement.executeUpdate("delete from student where id=101");
        System.out.println("delete Record Suceess");
    }


}
