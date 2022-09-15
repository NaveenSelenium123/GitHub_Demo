package org.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseConnection {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","system");
	String s="select * from student";
	PreparedStatement prepareStatement = connection.prepareStatement(s);
	ResultSet rs = prepareStatement.executeQuery();
	while(rs.next()) {
		String string = rs.getString("cid");
		System.out.println(string);
	}
	connection.close();
}
}
