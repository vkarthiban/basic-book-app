package book_order;

public class TestUserDao {

	public static void main(String[] args) throws Exception 
	{
		
		User us=new User();
		us.setName("karthiban");
		us.setEmail("karthi579@");
		us.setPass("karthiban");
		UserDAo.insert(us);

	}

}
