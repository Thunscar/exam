import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;


public class Deltest {
	static int i;
	public static void deltest()throws Exception{
		try {
			System.out.println("������Ҫɾ������ţ�");
			Scanner scanner=new Scanner(System.in);
			i=scanner.nextInt();
			String sql="delete from test where id='"+i+"'";
			Connection con=DataOption.getConnection();
			Statement stat=con.createStatement();
			stat.executeUpdate(sql);
			stat.close();
			con.close();
			System.out.println("ɾ���ɹ���");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
