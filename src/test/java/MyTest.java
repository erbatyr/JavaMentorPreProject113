import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.*;

public class MyTest {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		UserServiceTest userServiceTest = new UserServiceTest();
		userServiceTest.createUsersTable();
		userServiceTest.saveUser();
		userServiceTest.saveUser();
		userServiceTest.getAllUsers();
		userServiceTest.removeUserById();
		userServiceTest.cleanUsersTable();
		userServiceTest.dropUsersTable();
//
//		UserServiceImpl userService = new UserServiceImpl();
//		userService.createUsersTable();
	}
}
