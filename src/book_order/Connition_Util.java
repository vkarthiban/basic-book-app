package book_order;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	 
	public class Connition_Util 
	{
		

	    
	 
	
	    

		public static Connection getConnection() throws ClassNotFoundException, SQLException
		{
			   Class.forName("com.mysql.jdbc.Driver");
		       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/karthi", "root", "root");
		       return (conn);
		}
	      
	 
	 }
	 
	
	
	

