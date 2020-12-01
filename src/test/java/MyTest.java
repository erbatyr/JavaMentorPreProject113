import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.*;

public class MyTest {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		UserServiceImpl userService = new UserServiceImpl();
		userService.saveUser("Jackie", "Chan", (byte) 66);
		userService.saveUser("Bruce", "Willis", (byte) 65);
		userService.saveUser("Jamie", "Foxx", (byte) 52);
		userService.saveUser("Jeremy", "Renner", (byte) 49);
//		UserServiceTest userServiceTest = new UserServiceTest();
//		userServiceTest.createUsersTable();
//		userServiceTest.saveUser();
//		userServiceTest.saveUser();
//		userServiceTest.saveUser();
//		userServiceTest.saveUser();
//		userServiceTest.getAllUsers();
//		userServiceTest.removeUserById();
//		userServiceTest.cleanUsersTable();
//		userServiceTest.dropUsersTable();
//
//		UserServiceImpl userService = new UserServiceImpl();
//		userService.createUsersTable();
	}
}
