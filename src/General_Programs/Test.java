package General_Programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		
		String driver= "com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/edu";
		String username="root";
		String password="Balu@359";
		
		try
		{
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, username, password);
			Statement stmt=con.createStatement();
			ResultSet res=stmt.executeQuery("select * from employee");
			System.out.println("ID  "+"  Name  "+"  Designation ");
			while(res.next())
			{
				System.out.print(res.getInt(1)+"      ");
				System.out.print(res.getString(2)+"      ");
				System.out.print(res.getString(3));
				System.out.println();
			}
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
