package github;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbcdelete {
	static String jdbcDriver="oracle.jdbc.driver.OracleDriver";
	static String dbUrl="jdbc:oracle:thin:@localhost:1521:db11g";
	public static void main(String[] args)
	{
		String userName="System";
		String password="system";
		try
		{
			Class.forName(jdbcDriver);
					Connection conn=DriverManager.getConnection(dbUrl,userName,password);
					PreparedStatement stmt=conn.prepareStatement("delete from employee where empid=?");
	stmt.setInt(1,1);
	
int i=stmt.executeUpdate();
	System.out.print(i+"records");
	conn.close();
			}
		catch(Exception e)
		{
		System.out.println(e);
	}
	}
}
