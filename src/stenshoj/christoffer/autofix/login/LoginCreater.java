package stenshoj.christoffer.autofix.login;

import java.sql.SQLException;
import java.sql.Statement;

import stenshoj.christoffer.autofix.Mechanic;

public class LoginCreater {
	SqliteConnection connectionMaker = new SqliteConnection();
	
	public String create(Mechanic mechanic) {
		Statement statement;
		try {
			statement = connectionMaker.getConnection().createStatement();
			statement.execute("CREATE TABLE IF NOT EXISTS orders (Id INT PRIMARY KEY, "
					+ "customerId INTEGER, "
					+ "carRegNo TEXT, "
					+ "orderDate TEXT, "
					+ "expectedDate TEXT, "
					+ "price NUMERIC, "
					+ "issue TEXT, "
					+ "status TEXT);");
			
			statement.execute("CREATE TABLE IF NOT EXISTS login ("
					+ " username TEXT, "
					+ "password TEXT);");
			
			statement.execute("INSERT INTO login (username, password) values ('"+ mechanic.getUsername() + "', '"+ mechanic.getPassword() + "');");
			mechanic.setAuthorized(true);
			return "Authorized";
		} catch (SQLException e) {
			e.printStackTrace();
			return "Error";
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return "Error";
		}
		
	}
}
