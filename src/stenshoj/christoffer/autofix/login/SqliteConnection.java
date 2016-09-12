package stenshoj.christoffer.autofix.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqliteConnection {
	
	public Connection getConnection() throws SQLException, ClassNotFoundException{
		try {
			Class.forName("org.sqlite.JDBC").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return DriverManager.getConnection("jdbc:sqlite:/C:/_DEVELOPMENT_/myTestdb.db");
	}
}
