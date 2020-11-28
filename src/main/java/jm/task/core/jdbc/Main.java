package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//        String dbUrl = "jdbc:mysql://localhost/mysql?useUnicode=true&serverTimezone=UTC";
//        String user = "root";
//        String password = "matheus18";
//        Util util = new Util(JDBC_DRIVER, dbUrl, user, password);
//        util.getConnection();

        UserServiceImpl userService = new UserServiceImpl();
//        userService.createUsersTable();
//        userService.dropUsersTable();
//        userService.saveUser("Callum", "Johnson", (byte) 40);
//        userService.removeUserById(1);
//        List users = userService.getAllUsers();
        userService.cleanUsersTable();

    }
}
