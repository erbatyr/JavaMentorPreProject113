package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() throws SQLException, ClassNotFoundException {
        Connection connection = new Util().getConnection();
        Statement statement = connection.createStatement();
        String sql = "CREATE TABLE IF NOT EXISTS users" +
                " (id INTEGER not NULL AUTO_INCREMENT, " +
                " name VARCHAR(255), " +
                " lastname VARCHAR(255), " +
                " age INTEGER, " +
                " PRIMARY KEY ( id ))";

        statement.executeUpdate(sql);
    }

    public void dropUsersTable() throws SQLException, ClassNotFoundException {
        Connection connection = new Util().getConnection();
        Statement statement = connection.createStatement();
        String sql = "DROP TABLE IF EXISTS users ";
        statement.executeUpdate(sql);
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException, ClassNotFoundException {
        Connection connection = new Util().getConnection();
        Statement statement = connection.createStatement();
        String sql = "INSERT INTO users (name, lastname, age) " + "VALUES ('"+ name +"', '" + lastName + "', " + age + ")";
        statement.executeUpdate(sql);
        System.out.println("User с именем – " + name + " добавлен в базу данных");
    }

    public void removeUserById(long id) throws SQLException, ClassNotFoundException {
        Connection connection = new Util().getConnection();
        Statement statement = connection.createStatement();
        String sql = "DELETE FROM users " + "WHERE id = " + id + "";
        statement.executeUpdate(sql);
    }

    public List<User> getAllUsers() throws SQLException, ClassNotFoundException {
        List<User> users = new ArrayList<>();

        Connection connection = new Util().getConnection();
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM users";
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
            User user = new User();
            user.setId((long) rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setLastName(rs.getString("lastname"));
            user.setAge((byte) rs.getInt("age"));
            users.add(user);
        }

        return users;
    }

    public void cleanUsersTable() throws SQLException, ClassNotFoundException {
        Connection connection = new Util().getConnection();
        Statement statement = connection.createStatement();
        String sql = "DELETE FROM users";
        statement.executeUpdate(sql);
    }
}
