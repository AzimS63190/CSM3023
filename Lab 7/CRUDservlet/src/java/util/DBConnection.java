/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.util;

/**
 *
 * @author Azim S63190
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static Connection myConnection = null;
    private static String myURL = "jdbc:mysql://localhost:3306/csf3107";

    public DBConnection() {
    }

    public static Connection getConnection() throws ClassNotFoundException {
        if (myConnection != null) {
            return myConnection;
        } else try {
            Class.forName("com.mysql.jdbc.Driver");
            myConnection = DriverManager.getConnection(myURL, "root", "admin");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return myConnection;
    }

    // closing the DB connection
    public static void closeConnection() {
        try {
            myConnection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
