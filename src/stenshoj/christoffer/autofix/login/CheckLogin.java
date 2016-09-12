package stenshoj.christoffer.autofix.login;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import stenshoj.christoffer.autofix.Mechanic;

public class CheckLogin {

	SqliteConnection connectionMaker = new SqliteConnection();
	public String check(Mechanic mechanic) {
		try {
			Statement statement = connectionMaker.getConnection().createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM login WHERE " + "username == '" + mechanic.getUsername() +  "' AND password == '"+ mechanic.getPassword() + "'");
			if(!result.next())
				return "Bad_Credentials";
			mechanic.setAuthorized(true);
			return "Authorized";
		} catch (SQLException e) {
			return "Error";
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			return "Error";
		}
	}

}
