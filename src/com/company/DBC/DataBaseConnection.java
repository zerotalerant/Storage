package com.company.DBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
        private static final String URL = "jdbc:postgresql://localhost:5432/post";
        private static final String USER = "postgres";
        private static final String PASSWORD = "radik";

        public static Connection connection() {
            Connection connection = null;
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            return connection;
        }
}
