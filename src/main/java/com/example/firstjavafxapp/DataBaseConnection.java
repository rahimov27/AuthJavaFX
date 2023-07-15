package com.example.firstjavafxapp;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;


public class DataBaseConnection {
    public Connection databaseLink;

    public Connection getConnection() {
        String databaseName = "UserAccounts";
        String databaseUser = "";
        String databasePassword = "328332Umca";
        String url = "jdbc:mysql://localhost/" + databaseName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url,databaseUser,databasePassword);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return databaseLink;

    }
}
