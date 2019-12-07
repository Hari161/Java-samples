package github;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbcselect {
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
					PreparedStatement stmt=conn.prepareStatement("select * from employee");
					ResultSet rs=stmt.executeQuery();
					while(rs.next()) {
						System.out.println("EMPID :"+rs.getInt(1)+"NAME :"+rs.getString(2)+"AMOUNT :"+rs.getInt(3));
						
					}
	conn.close();
			}
		catch(Exception e)
		{
		System.out.println(e);
	}
	}
}
