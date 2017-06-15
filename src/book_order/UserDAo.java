package book_order;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;


public class UserDAo 
{

	public static void insert(User user) throws Exception
	{
	
		String query="insert into users( name ,email,password)values(?,?,?) ";
		
		 Connection conn= Connition_Util.getConnection();
		 PreparedStatement prs= conn.prepareStatement(query);
	
		 prs.setString(1,user.getName());
		 prs.setString(2,user.getEmail());
		 prs.setString(3,user.getPass());
		 int num=prs.executeUpdate();
		 System.out.println(num+"row inserted");
		 
	}
	
}
                              