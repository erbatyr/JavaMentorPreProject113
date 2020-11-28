package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    Connection connection;
	private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private String dbUrl = "jdbc:mysql://localhost/mysql?useUnicode=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "matheus18";

	public Util(String jdbcDriver, String dbUrl, String user, String password) throws ClassNotFoundException, SQLException {
		Class.forName(jdbcDriver);
		connection = DriverManager.getConnection(dbUrl, user, password);
	}

	public Util() throws ClassNotFoundException, SQLException {
//		Class.forName(JDBC_DRIVER);
		connection = DriverManager.getConnection(dbUrl, user, password);
	}

	public Connection getConnection() {
		return connection;
	}
}
