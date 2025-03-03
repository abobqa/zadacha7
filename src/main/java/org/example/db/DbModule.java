package org.example.db;

import java.sql.*;


public class DbModule {
    private static final String URL = "jdbc:postgresql://localhost:5432/amigo";
    private static final String USER = "postgres";
    private static final String PASSWORD = "12345";

    private static Connection conn;

    static {
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Ошибка подключения: " + e.getMessage());
            System.exit(228);
        }
    }

    public static Connection getConnection() {
        return conn;
    }
}