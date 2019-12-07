package github;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbcoperations {
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
	String createSQL="create table employee(empid int,empname varchar(20),amount int)";
	PreparedStatement stmt=conn.prepareStatement(createSQL);
	conn.close();
		}
	catch(Exception e)
	{
	System.out.println(e);
}
}
}
