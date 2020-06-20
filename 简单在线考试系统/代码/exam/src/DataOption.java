import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataOption {
	public static Connection getConnection()  
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");//1
		    con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/examination", "root", "admin");//2
		} catch (ClassNotFoundException e) {
			 
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
		 
			e.printStackTrace();
			return null;
		}
		return con;
	}
}
