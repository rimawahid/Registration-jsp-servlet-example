package com.registration.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

//    public static Connection getConnection() {
//        Connection con = null;
//        String url = "jdbc:mysql://localhost:3306/jsp";
//        String uname = "root";
//        String pass = "root";
//        try {
//            con = DriverManager.getConnection(url, uname, pass);
//        } catch (SQLException ex) {
//            System.out.println("Couldn't Connect");
//        }
//        return con;
//    }
    
     static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp",
                    "root", "root");

        } catch (Exception e) {
        }
        return con;
    }

}
