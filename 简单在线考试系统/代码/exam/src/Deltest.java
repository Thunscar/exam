import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;


public class Deltest {
	static int i;
	public static void deltest()throws Exception{
		try {
			System.out.println("请输入要删除的题号：");
			Scanner scanner=new Scanner(System.in);
			i=scanner.nextInt();
			String sql="delete from test where id='"+i+"'";
			Connection con=DataOption.getConnection();
			Statement stat=con.createStatement();
			stat.executeUpdate(sql);
			stat.close();
			con.close();
			System.out.println("删除成功！");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
