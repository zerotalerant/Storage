package com.company;

import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static final String url = "jdbc:postgresql://localhost:5433/";
    private static final String user = "postgres";
    private static final String password = "master";
    public static void main ( String[] args )
    {
        Map<Coach, String> coaches = getCoach();
        System.out.println(coaches);
    }
    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public static Map<Coach, String> getCoach() {
        Map<Coach, String> coaches = new HashMap<>();
//        String SQL = "SELECT sum(id_salary) FROM coach c"; итоговая заработную плату
        String SQL = "SELECT * FROM coach c";
        int count = 0;
        String text = "Молодец";
        Connection conn = null;
        try  {
            conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()){
                Coach coach = new Coach();
                coach.setId(rs.getLong("id"));
                coach.setSportType(rs.getString("id_sport_type"));
                coach.setIdSalary(rs.getLong("id_salary"));
                coaches.put(coach, coach.getSportType().length() >= 3 ?"Молодец" : "Не молодец");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }finally {
            try {
                conn.close();
            }catch (SQLException throwables){
                throwables.printStackTrace();
            }
        }
        return coaches;
    }
}
