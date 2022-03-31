package com.company.Dao;

import com.company.DBC.DataBaseConnection;

import java.sql.*;
import java.time.LocalDateTime;
public class UserDao {

    public boolean addUser(UserModel user) {
        String sql = "INSERT INTO users(user_name,e_mail,password,data_of_registration,is_blocked)" +
                     "VALUES(?,?,?,now(),false)";
        try (Connection connection = DataBaseConnection.connection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, user.getUserName());
            statement.setString(2, user.geteMail());
            statement.setString(3, user.getPassword());
            return 0 < statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;

    }

    public UserModel getByName(String name) {
        String sql = "SELECT user_id ,user_name, e_mail, password, is_blocked FROM users " +
                     "WHERE user_name = " + "'" + name + "';";
        try (Connection connection = DataBaseConnection.connection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                return new UserModel(
                        resultSet.getLong("user_id"),
                        resultSet.getString("user_name"),
                        resultSet.getString("e_mail"),
                        resultSet.getString("password"),
                        resultSet.getBoolean("is_blocked"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public UserModel getUser(Long id) {
        String sql = "SELECT * FROM users " +
                     "WHERE user_id = " + id;
        try (Connection connection = DataBaseConnection.connection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                return new UserModel(resultSet.getLong("user_id"),
                        resultSet.getString("user_name"),
                        resultSet.getString("e_mail"),
                        resultSet.getString("password"),
                        resultSet.getTimestamp("data_of_registration"),
                        resultSet.getBoolean("is_blocked"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void blocUnblock(UserModel user, UserLogsModel userLogsModel) {
        boolean unlock = false;
        if (userLogsModel.getCounter() > 3) {
            unlock = true;
            LocalDateTime localDateTime = LocalDateTime.now().plusMinutes(5);
            String sql = "UPDATE user_logs " +
                         "SET update_time = " + localDateTime;
            try (Connection connection = DataBaseConnection.connection();
                 PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }
        String sql = "UPDATE users " +
                     " SET is_blocked = " + unlock +
                     "," +
                     " WHERE user_id = " + user.getId();

        try (Connection connection = DataBaseConnection.connection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean deleteUser(Long user_id) {
        String sql = "DELETE FROM users WHERE user_id =" + user_id;
        try (Connection con = DataBaseConnection.connection();
             Statement statement = con.prepareStatement(sql)
        ) {
            return 0 < statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
