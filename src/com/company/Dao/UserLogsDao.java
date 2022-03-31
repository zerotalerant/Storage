package com.company.Dao;

import com.company.DBC.DataBaseConnection;

import java.sql.*;

public class UserLogsDao {
    public final UserDao userDao = new UserDao();


    public boolean addUserLogs(UserModel user, String result) {
        String sql = "INSERT INTO user_logs(user_id,login_time,counter,login_result)" +
                     "VALUES(?,now(),0, ?)";
        try (Connection connection = DataBaseConnection.connection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, user.getId());
            statement.setString(2, result);
            return 0 < statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public UserLogsModel getUserLogsByUserID(Long user_id) {
        String sql = "SELECT * FROM user_logs " +
                     "where user_id = "+user_id;
        try(Connection connection = DataBaseConnection.connection();
            Statement statement= connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {
            resultSet.next();
            return new UserLogsModel(userDao.getUser(user_id),
                    resultSet.getTimestamp("login_time"),
                    resultSet.getString("login_result"));
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public boolean updateUserLogs(Long userId, String checkFailOrSuccess) {
        if (checkFailOrSuccess.equals("FAIL")) {
            String sql = "UPDATE user_logs " +
                         "SET counter = (SELECT t.counter FROM user_logs t WHERE t.user_id = " + userId + ")+1," +
                         " update_time = now() " +
                         "WHERE user_id = " + userId;
            try (Connection connection = DataBaseConnection.connection();
                 PreparedStatement statement = connection.prepareStatement(sql)) {
                return 0 < statement.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } else {
            String sql = "UPDATE user_logs" +
                         " SET counter = 0," +
                         " update_time = now() " +
                         "WHERE user_id = " + userId;
            try (Connection connection = DataBaseConnection.connection();
                 PreparedStatement statement = connection.prepareStatement(sql)) {
                return 0 < statement.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }

    public int countLog(Long userId) {
        String sql = "SELECT counter FROM user_logs " +
                     "WHERE user_id = " + userId;
        try (Connection connection = DataBaseConnection.connection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            resultSet.next();

            return resultSet.getInt("counter");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
